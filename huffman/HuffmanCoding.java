import java.io.*;
import java.util.*;

class HuffmanNode {
    char character;
    int frequency;
    HuffmanNode left;
    HuffmanNode right;

    HuffmanNode(char character, int frequency) {
        this.character = character;
        this.frequency = frequency;
        this.left = null;
        this.right = null;
    }
}

class HuffmanComparator implements Comparator<HuffmanNode> {
    public int compare(HuffmanNode x, HuffmanNode y) {
        return x.frequency - y.frequency;
    }
}

public class HuffmanCoding {

    private static Map<Character, String> huffmanCodes = new HashMap<>();
    private static HuffmanNode root;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите путь к файлу для сжатия: ");
        String inputFilePath = scanner.nextLine();
        System.out.println("Введите путь для сохранения сжатого файла: ");
        String compressedFilePath = scanner.nextLine();
        System.out.println("Введите путь для сохранения декодированного файла: ");
        String decompressedFilePath = scanner.nextLine();

        try {
            String input = readFile(inputFilePath);

            Map<Character, Integer> frequencyMap = new HashMap<>();
            for (char c : input.toCharArray()) {
                frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
            }

            PriorityQueue<HuffmanNode> priorityQueue = new PriorityQueue<>(new HuffmanComparator());
            for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
                priorityQueue.add(new HuffmanNode(entry.getKey(), entry.getValue()));
            }

            while (priorityQueue.size() > 1) {
                HuffmanNode left = priorityQueue.poll();
                HuffmanNode right = priorityQueue.poll();

                HuffmanNode newNode = new HuffmanNode('-', left.frequency + right.frequency);
                newNode.left = left;
                newNode.right = right;

                priorityQueue.add(newNode);
            }

            root = priorityQueue.poll();

            generateHuffmanCodes(root, "");

            StringBuilder compressed = new StringBuilder();
            for (char c : input.toCharArray()) {
                compressed.append(huffmanCodes.get(c));
            }

            writeFile(compressedFilePath, compressed.toString());

            String decompressed = decode(compressed.toString());
            writeFile(decompressedFilePath, decompressed);

            double compressionRatio = (double) compressed.length() / (input.length() * 8);
            System.out.printf("Коэффициент сжатия: %.2f%%%n", compressionRatio * 100);

            if (input.equals(decompressed)) {
                System.out.println("Декодирование выполнено успешно: исходная строка совпадает с декодированной.");
            } else {
                System.err.println("Ошибка декодирования: исходная строка не совпадает с декодированной.");
            }

            System.out.println("Сжатие и декодирование завершены.");
        } catch (IOException e) {
            System.err.println("Ошибка при работе с файлами: " + e.getMessage());
        }

        scanner.close();
    }

    private static void generateHuffmanCodes(HuffmanNode node, String code) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            huffmanCodes.put(node.character, code);
        }

        generateHuffmanCodes(node.left, code + "0");
        generateHuffmanCodes(node.right, code + "1");
    }

    private static String decode(String compressed) {
        StringBuilder result = new StringBuilder();
        HuffmanNode current = root;

        for (char bit : compressed.toCharArray()) {
            current = (bit == '0') ? current.left : current.right;

            if (current.left == null && current.right == null) {
                result.append(current.character);
                current = root;
            }
        }

        return result.toString();
    }

    private static String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString().trim();
    }

    private static void writeFile(String filePath, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(content);
        }
    }
}

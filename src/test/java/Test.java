import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.File;
import java.io.IOException;


//public class Test  {

//    public static void main(String[] args) throws IOException {
//        File file = new File("/Users/nazariybrynyarsky/Desktop/Java/JavaEE/Translator/Translator/src/main/translations/en-ua.json");
//        ObjectMapper objectMapper = new ObjectMapper();
//        JsonNode rootNode = objectMapper.readTree(file);
//
//        for (JsonNode node : rootNode) {
//            if ("zymotic".equals(node.get("key").asText())) {
//                JsonNode valuesNode = node.get("values");
//                for (JsonNode value : valuesNode) {
//                    System.out.println(value.asText());
//                }
//            }
//        }
//    }

//    public String getTranslation(String word) throws IOException {
//        MainServlet servlet = new MainServlet();
//
//        File file = new File("/Users/nazariybrynyarsky/Desktop/Java/JavaEE/Translator/Translator/src/main/translations/en-ua.json");
//        ObjectMapper objectMapper = new ObjectMapper();
//        JsonNode rootNode = objectMapper.readTree(file);
//        String translations;
//
//        StringBuilder buildTranslations = new StringBuilder();
//
//        for (JsonNode node : rootNode) {
//            if (word.equals(node.get("key").asText())) {
//                JsonNode valuesNode = node.get("values");
//                for (JsonNode value : valuesNode) {
//                    buildTranslations.append(value.asText() + ", ");
//                }
//            }
//        }
//        translations = buildTranslations.toString();
//        return translations;
//    }
//
//    public static void main(String[] args) throws IOException {
//        Test processor = new Test();
//        System.out.println(processor.getTranslation("zymotic"));
//
//    }
//}
//

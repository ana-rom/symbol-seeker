import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SymbolSeeker {
    public char findUniqueSymbol(String text) {
        List<Character> uniqueSymbols = Arrays
                .stream(text.toLowerCase().split("\\W+"))
                .map(w -> (char) w.chars()
                        .distinct()
                        .findFirst()
                        .getAsInt())
                .toList();

        Map<Character, Long> characterAmount = new LinkedHashMap<>();

        for (Character symbol : uniqueSymbols) {
            if (characterAmount.containsKey(symbol)) {
                characterAmount.put(symbol, characterAmount.get(symbol) + 1);
            } else {
                characterAmount.put(symbol, 1L);
            }
        }
        System.out.println(characterAmount);

        return characterAmount.entrySet().stream()
                .filter(ch -> ch.getValue() == 1)
                .findFirst()
                .get()
                .getKey();
    }
}

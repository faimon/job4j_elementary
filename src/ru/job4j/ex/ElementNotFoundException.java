package ru.job4j.ex;

public class ElementNotFoundException extends Exception {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
            int rsl = -1;
            for (int i = 0; i < value.length; i++) {
                if (value[i].equals(key)) {
                    rsl = i;
                }
            }
            if (rsl == -1) {
                throw new ElementNotFoundException();
            }
            return rsl;
    }

    public static void main(String[] args) {
        String[] value = {"a", "b", "c"};
        try {
            System.out.println("Индекс элемента 'c' равен: " + indexOf(value, "c"));
        } catch (ElementNotFoundException e) {
            System.out.println("Элемент не найден");
        }
    }
}

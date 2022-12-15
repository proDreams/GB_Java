public class task3_v2 {
    public static void main(String[] args) {
        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        String[] res = json.replaceAll("[^a-zA-Zа-яА-Я0-9:,]", "")
                .replaceAll("[^a-zA-Zа-яА-Я0-9]", " ")
                .split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < res.length; i += 6) {
            result.append("Студент ")
                    .append(res[i + 1])
                    .append(" получил ")
                    .append(res[i + 3])
                    .append(" по предмету ")
                    .append(res[i + 5])
                    .append(".\n");
        }
        System.out.println(result);
    }
}
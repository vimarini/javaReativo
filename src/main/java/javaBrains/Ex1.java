package javaBrains;
public class Ex1 {
    public static void main(String[] args) {
        // Use StreamSources.intNumbersStream() and StreamSources.userStream()
        // Print all numbers in the intNumbersStream stream
//        StreamSources.intNumbersStream().forEach(e -> System.out.println(e));

        // Print numbers from intNumbersStream that are less than 5
//        StreamSources.intNumbersStream().filter(e -> e < 5)
//                .forEach(e -> System.out.println(e));

        // Print the second and third numbers in intNumbersStream that's greater than 5
//        StreamSources.intNumbersStream().filter(e -> e < 5)
//                .skip(1)
//                .limit(2)
//                .forEach(e -> System.out.println(e));

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
//        Integer value = StreamSources.intNumbersStream().filter(e -> e > 5)
//                .findFirst()
//                .orElse(-1);
//        System.out.println(value);

        // Print first names of all users in userStream
//        StreamSources.userStream()
//                .forEach(e -> System.out.println(e.getFirstName()));


        // Print first names in userStream for users that have IDs from number stream
        StreamSources.userStream()
                .filter(user -> StreamSources.intNumbersStream().toList().contains(user.getId()))
                .forEach(e -> System.out.println(e.getFirstName()));

        StreamSources.userStream()
                .filter(user -> StreamSources.intNumbersStream().anyMatch(i -> i==user.getId()))
                .forEach(System.out::println);

        StreamSources.intNumbersStream()
                .flatMap(id -> StreamSources.userStream().filter(user -> user.getId() == id))
                .map(user -> user.getFirstName())
                .forEach(e -> System.out.println(e));


    }



}

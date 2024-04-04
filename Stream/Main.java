package Stream;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
	ArrayList<String> names = new ArrayList<>();
	names.add("John");
	names.add("Emma");
	names.add("Alex");
	names.add("Michael");
	names.add("Sarah");
	
	// Lọc các tên có độ dài lớn hơn 4
	List<String> filteredNames = names.stream()
	.filter(name -> name.length() > 4)
	.collect(Collectors.toList());
	filteredNames.forEach(System.out::println);
	
	// Sắp xếp các tên theo thứ tự bảng chữ cái
	List<String> sortedNames = names.stream()
	.sorted()
	.collect(Collectors.toList());
	sortedNames.forEach(System.out::println);
	}
}

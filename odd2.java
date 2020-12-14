private static List<Integer> getOddNumbers(List<Integer> numbers)
{
	return numbers
			.stream()
			.filter(n -> n%2 == 1)
			.collect(toList());
}

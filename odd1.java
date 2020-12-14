private static List<Integer> getOddNumbers(List<Integer> numbers)
{
  List<Integer> oddList = new ArrayList<Integer>();
	for(int i = 0; i < numbers.size(); i++)
	 	if(numbers.get(i) % 2 == 1)
  		oddList.add(numbers.get(i));
	return oddList;
}

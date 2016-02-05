def findElementInList = {list, element -> list.contains(element)}

List list = new ArrayList();
list.add(1);
list.add(2);
list.add(3);


assert findElementInList(list, 1) == true;
assert findElementInList(list, 3) == true;
assert findElementInList(list, 9) == true;
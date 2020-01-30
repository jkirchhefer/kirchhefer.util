public static <type extends Comparable<? super type>> void sortArrayList(ArrayList<type> arrayList)
{
    int size = arrayList.size();

    for(int i = 0; i < size - 1; i++)
    {
        int minIndex = i;

        for (int j = i + 1; j < size; j++)
            if (arrayList.get(j).compareTo(arrayList.get(minIndex)) < 0)
                minIndex = j;

        type temp = arrayList.get(minIndex);
        arrayList.set(minIndex, arrayList.get(i));
        arrayList.set(i, temp);
    }
}

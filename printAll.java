public static <type> void printAll(ArrayList<type> arrayList, int perLine)
{
    if (arrayList.size() > 0)
    {
        int count = 0;

        for (type item: arrayList)
        {
            System.out.print(item + "    ");
            count++;

            if (count == perLine)
            {
                count = 0;
                System.out.println();
            }
        }

        if (count < perLine)
            System.out.println();

    }
    else
    {
        System.out.println("No items");
    }
}

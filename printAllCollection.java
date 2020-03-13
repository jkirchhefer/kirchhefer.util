public static <type> void printAll(Collection<type> arrayList, int perLine)
    {
        Iterator<type> iterator = arrayList.iterator();

        if (arrayList.size() > 0)
        {
            int count = 0;

            while(iterator.hasNext()) {
                System.out.print(iterator.next() + "    ");
                count++;

                if (count == perLine) {
                    System.out.println();
                    count = 0;
                }
            }
        }
        else
        {
            System.out.println("No items");
        }
    }

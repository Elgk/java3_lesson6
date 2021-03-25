public class ArraysTasks implements ArraysT{
    @Override
    public int[] cutArr(int[] arr) {
        int[] newArr = null;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4) {
                int val = arr.length - i - 1;
                newArr = new int[val];
                System.arraycopy(arr, i + 1, newArr, 0, val);
                break;
            }
        }
        if (newArr == null){
            throw new RuntimeException("Задача не может быть решена: входной массив не содержит цифры 4.");
        }
        return  newArr;
    }

    @Override
    public boolean checkArr(int[] arr) {
        boolean flag1 = false;
        boolean flag2 = false;
        for (int t: arr ) {
            if (t != 1 && t != 4) {
                return false;
            }
        }
        for (int t: arr ) {
            if (t == 1) {
                flag1 = true;
                break;
            }
        }
        for (int t: arr ) {
            if (t == 4){
                flag2 = true;
                break;
            }
        }
        return (flag1 && flag2);
    }
}

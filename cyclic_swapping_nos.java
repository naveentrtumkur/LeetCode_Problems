//cyclic swapping to arraynge numbers in rrspective positions.

public int miniSwapsArray(int[] row) {
    int res = 0, N = row.length;

    for (int i = 0; i < N; i++) {
	for (int j = row[i]; i != j; j = row[i]) {
	    swap(row, i, j);
	    res++;
	}
    }

    return res;
}

private void swap(int[] arr, int i, int j) {
    int t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;
}


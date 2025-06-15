

class countTriplet {
    public static int countTriplet(int arr[], int n) {
       

	// Function to find the count of the
	// triplets such that sum of two
	// numbers is equal to the third number

		int count = 0;

		// Loop to count for triplets
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] == arr[k]) {
						count++;
					 System.out.println("("+arr[i]+","+arr[j]+")"+"="+arr[k]);
					}
					else if (arr[i] + arr[k] == arr[j]) {
						count++;
						System.out.println("("+arr[i]+","+arr[k]+")"+"="+arr[j]);
					}
					else if (arr[j] + arr[k] == arr[i]) {
						count++;
						System.out.println("("+arr[j]+","+arr[k]+")"+"="+arr[i]);
					}
				}
			}
		}
		return count;
    }

        public static void main(String rgs[])
        {
            int arr[]={1, 5, 3, 2};

            int n=arr.length;

            System.out.println("count is :"+countTriplet(arr,n));
        }
        
    }
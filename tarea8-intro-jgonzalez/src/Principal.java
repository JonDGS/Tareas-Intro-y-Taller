
public class Principal {
	int[] lista;
	int len;
	public Principal(int[] lista1) {
		this.lista = lista1;
		this.len = lista1.length;
	}
	public static boolean binarySearch(int[] array, int value)  {
	    int start = 0;
	    int end = array.length -1;              
	     
	    for (int i = 0; i < array.length; i++)   {
	        int middle = (end - start)/2;
	        if (array[i] == value)  {
	            return true;
	        }
	        else if (array[middle] > value)  {
	            end = middle - 1;
	        }
	        else    {
	            start = middle + 1;
	        }
	    }
	    return false;
	}
	public static void main(String[] args) {
		Principal hola = new Principal(int[] [1,3,5,6,7,8]);
		
		
		
		
			
		}
	}
	}

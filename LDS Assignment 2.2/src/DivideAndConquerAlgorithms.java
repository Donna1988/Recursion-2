//Donna Marshall R00002341
/**
 * The class contains the Divide and Conquer-based Algorithms we are using. 
 */
public class DivideAndConquerAlgorithms {

	//----------------------------------------------
	// Class constructor
	//----------------------------------------------	
	/**
	 * Constructor of the class. Do not edit it.
	 */
	public DivideAndConquerAlgorithms(){}
		
	//-------------------------------------------------------------------
	// 0. iterativeDisplayElements --> Displays all elements of a MyDynamicList 
	//-------------------------------------------------------------------	
	/**
	 * Given a concrete MyDynamicList, this iterative algorithm displays its elements by screen (if any).
	 * @param m: The MyDynamicList we want to display its elements.	  
	 */	
	public void iterativeDisplayElements(MyDynamicList m){
		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0; 
		
		//Rule 1. MyDynamicList is empty
		if (m.length() == 0) 
			scenario = 1;
		//Rule 2. MyDynamicList is non-empty
		else
			scenario = 2;

		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario){	
				
		//Rule 1. MyDynamicList is empty
		case 1: 
			//1. We print the empty message
			System.out.println("Empty MyDynamicList");
			
			break;
			
		//Rule 2. MyDynamicList is non-empty
		case 2: 
			//1. We print the initial message
			int size = m.length();
			System.out.println("MyDynamicList Contains the following " + size + " items: ");
			
			//2. We traverse the items
			for (int i = 0; i < size; i++)
				System.out.println("Item " + i + ": " + m.getElement(i));
			
			break;
	
		}
		
	}

	//-------------------------------------------------------------------
	// 1. recursiveDisplayElements --> Displays all elements of a MyDynamicList  
	//-------------------------------------------------------------------	
	/**
	 * Given a concrete MyDynamicList, this recursive algorithm displays its elements by screen (if any).
	 * @param m: The MyDynamicList we want to display its elements.	  
	 */	
	public void recursiveDisplayElements(MyDynamicList m){
		   showData(m , 0);
	}

	private int showData(MyDynamicList m, int index){

		 if(index < m.length() && index != -1) {

	        System.out.println(m.getElement(index));

	        index++;
	        return   showData( m, index );
	    }
	    return -1;
	}
		
		
			
	

	//-------------------------------------------------------------------
	// 2. smallerMyList --> Filters all elements in MyDynamicList smaller than e
	//-------------------------------------------------------------------	
	/**
	 * The function filters all elements of MyDynamicList being smaller than 'e'  
	 * @param m: The MyDynamicList we want to check.
	 * @param e: The number 'e' we want to compare each element of MyDynamicList to.
	 * @return: The new MyDynamicList containing just the elements being smaller than 'e'  
	 */	
	
		public MyDynamicList smallerMyList(MyDynamicList m, int e){

			   
			   MyDynamicList res = null;

			 
			   int scenario = 0;
			   if (m.length()==0)
			      scenario = 0;
			   if (m.length()==1)
			      scenario = 1;
			   if (m.length()>1)
			      scenario =2;

			   
			   switch(scenario){
			      case 0:
			         res = new MyDynamicList();
			         break;
			      case 1:
			         res = new MyDynamicList();
			         if (m.getElement(0)< e)
			            res.addElement(0, m.getElement(0));
			         break;
			      case 2:
			         int e0 = m.getElement(0);
			         m.removeElement(0);
			         res = smallerMyList(m,e);
			         if (e0 < e)
			            res.addElement(0, e0);
			         m.addElement(0,e0);
			         break;
			   }

			      
			   return res;
			}
		
		
	
	
	

	//-------------------------------------------------------------------
	// 3. biggerMyList --> Filters all elements in MyDynamicList bigger than e
	//-------------------------------------------------------------------	
	/**
	 * The function filters all elements of MyDynamicList being bigger than 'e'  
	 * @param m: The MyDynamicList we want to check.
	 * @param e: The number 'e' we want to compare each element of MyDynamicList to.
	 * @return: The new MyDynamicList containing just the elements being bigger or equal than 'e'  
	 */	
		public MyDynamicList biggerEqualMyList(MyDynamicList m, int e) {

		
			MyDynamicList res = null;

			// -----------------------------
			// SET OF OPS
			// -----------------------------

			// -----------------------------
			// I. SCENARIO IDENTIFICATION
			// -----------------------------
			int scenario = 0;
			if (m.length() == 0)
				scenario = 0;
			if (m.length() == 1)
				scenario = 1;
			if (m.length() > 1)
				scenario = 2;
			// -----------------------------
			// II. SCENARIO IMPLEMENTATION
			// -----------------------------
			switch (scenario) {
			case 0:
				res = new MyDynamicList();
				break;
			case 1:
				res = new MyDynamicList();
				if (m.getElement(0) >= e)
					res.addElement(0, m.getElement(0));
				break;
			case 2:
				int e0 = m.getElement(0);
				m.removeElement(0);
				res = biggerEqualMyList(m, e);
				if (e0 >= e)
					res.addElement(0, e0);
				m.addElement(0, e0);
				break;
			}

			// -----------------------------
			// Output Variable --> Return FinalValue
			// -----------------------------
			return res;
		}
		
		
		
	//-------------------------------------------------------------------
	// 3. concatenate --> It concatenates 2 MyDynamicList   
	//-------------------------------------------------------------------	
	/**
	 * The function concatenates the content of 2 MyDynamicList.   
	 * @param m1: The first MyDynamicList.
	 * @param m2: The second MyDynamicList.
	 * @return: The new MyDynamicList resulting of concatenate the other 2 MyDynamicList
	 */	
	public MyDynamicList concatenate(MyDynamicList m1, MyDynamicList m2){
		
		/*//-----------------------------
		//Output Variable --> InitialValue
		//-----------------------------
		MyDynamicList res = null;

		//-----------------------------
		//SET OF OPS
		//-----------------------------

		//-----------------------------
		// I. SCENARIO IDENTIFICATION
		//-----------------------------
		int scenario = 0; 				
		
		//-----------------------------
		// II. SCENARIO IMPLEMENTATION 
		//-----------------------------
		switch(scenario){	
			
		}
		
		//-----------------------------
		//Output Variable --> Return FinalValue
		//-----------------------------		
		return res;
		
*/	
	 
		
		//-----------------------------
				//Output Variable --> InitialValue
				//-----------------------------
				MyDynamicList res = null;

				//-----------------------------
				//SET OF OPS
				//-----------------------------

				//-----------------------------
				// I. SCENARIO IDENTIFICATION
				//-----------------------------
				int scenario = 0; 

				//Rule 1. MyDynamicList m1 is empty
				if (m1.length() == 0) 
					scenario = 1;
				else{
					//Rule 2. MyDynamicList m2 is empty
					if (m2.length() == 0) 
						scenario = 2;
					else{
						int m1E0 = m1.getElement(0);
						int m2E0 = m2.getElement(0);

						//Rule 3. m1 first element smaller or equal than m2 first element
						if (m1E0 < m2E0)
							scenario = 3;	
						//Rule 4. m1 first element bigger than m2 first element
						else
							scenario = 4;	
					}
				}

				//-----------------------------
				// II. SCENARIO IMPLEMENTATION 
				//-----------------------------

				int size = 0;
				int e0 = 0;
				int auxE = 0;

				switch(scenario){	

				//Rule 1. MyDynamicList m1 is empty
				case 1: 
					//1. We create the new list as a result
					res = new MyDynamicList();

					//2. We traverse all elements of m2, adding them to the list
					size = m2.length() - 1;
					while (size >= 0){
						//2.1. We access to the element in m2
						auxE = m2.getElement(size);

						//2.2. We append the element to res
						res.addElement(0, auxE); 

						//2.3. We decrease the index of size
						size--;
					}

					break;

					//Rule 2. MyDynamicList m2 is empty
				case 2: 
					//1. We create the new list as a result
					res = new MyDynamicList();

					//2. We traverse all elements of m1, adding them to the list
					size = m1.length() - 1;
					while (size >= 0){
						//2.1. We access to the element in m1
						auxE = m1.getElement(size);

						//2.2. We append the element to res
						res.addElement(0, auxE); 

						//2.3. We decrease the index of size
						size--;
					}

					break;

					//Rule 3. m1 first element smaller or equal than m2 first element
				case 3: 
					//1. We get the first element of m1
					e0 = m1.getElement(0);

					//2. We remove the first element from m1 we just checked
					m1.removeElement(0);

					//3. We recursively solve the smaller problem
					res = concatenate(m1, m2);

					//4. We add back e0 to the resulting list.
					res.addElement(0, e0);

					//5. We also add the element back to m1, so as to not to modify its original state
					m1.addElement(0, e0);

					break;			

					//Rule 4. m1 first element bigger than m2 first element
				case 4: 
					//1. We get the first element of m1
					e0 = m2.getElement(0);

					//2. We remove the first element from m1 we just checked
					m2.removeElement(0);

					//3. We recursively solve the smaller problem
					res = concatenate(m1, m2);

					//4. We add back e0 to the resulting list.
					res.addElement(0, e0);

					//5. We also add the element back to m1, so as to not to modify its original state
					m2.addElement(0, e0);

					break;							
				}

				//-----------------------------
				//Output Variable --> Return FinalValue
				//-----------------------------		
				return res;			
		
	}
		
		
	
		

}

/*
Name: Hunter McClure
CptS 233: MicroAssignment #2
Date: 10/12/2020
gitRepo url: https://github.com/Huntdawg13/MA2.git

*/
// Java program to illustrate the sum of two numbers 

// A BTree 
class Btree { 
	public BTreeNode root; // Pointer to root node 
	public int t; // Minimum degree 

	// Constructor (Initializes tree as empty) 
	Btree(int t) { 
		this.root = null; 
		this.t = t; 
	} 

	// function to traverse the tree 
	public void traverse() { 
		if (this.root != null) 
			this.root.traverse(); 
		System.out.println(); 
	} 

	// function to search for a key
	public BTreeNode search(int k) { 
		if (this.root == null) 
			return null; 
		else
			return this.root.search(k); 
	}
   
   public void insert(int k)
   {
      if(root == null)
      {
         root = new BTreeNode(t, true);
         root.keys[0] = k;
         root.n = 1;
      }
      else
      {
         if(root.n == 2*t-1)
         {
            BTreeNode s = new BTreeNode(t, false);
            
            s.C[0] = root;
            
            s.splitChild(0, root);
            
            root = s;
         }
         else
            root.insertNonFull(k);
         
         
      }
   } 
} 
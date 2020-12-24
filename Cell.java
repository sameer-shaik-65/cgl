package cgl;
public class Cell{
	//creating cells

public int countLiveCells(boolean[][] current,int a,int b){
    int l=current.length;
    int liv1=0;
for(int i=a-1;i<=a+1;i++){
    for(int j=b-1;j<=b+1;j++){
        if(i!=a||j!=b){
            if(i>=0 && i<l && j>=0 && j<l && current[i][j]){
                liv1+=1;
            }
        }
    }
}
return liv1;
}}
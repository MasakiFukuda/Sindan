/*
	**************************************************************
	****************** Created by MasakiFukuda *******************
	**************************************************************
*/

public abstract class Judge{
	public static int doJudge(int param){
		int result = 0;
		
		result = param % 15;
		
		return result;
	}
}
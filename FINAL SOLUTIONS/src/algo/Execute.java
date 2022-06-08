package algo;

public class Execute {
	
	/*
		In the beginning of each OBS recording, you have to run the following commands.
				
		ON A WINDOWS MACHINE:
		Run Windows Powershell as Administrator
		(Click on the start menu, write Powershell in the search box (or find Windows Powershell among all apps), 
		right click the powershell icon, and then click “Run as Administrator” in the context menu that appears.}
		and run the following two commands:
			Set-Service -Name “TermService” -Status stopped -StartupType disabled
			Set-Service -Name “vncserver” -Status stopped -StartupType disabled

		ON A MAC MACHINE:
		Run terminal (On mac, hit CMD+Space, write Terminal, and hit enter) and run the following command:
			sudo launchctl unload -w /System/Library/LaunchDaemons/com.apple.screensharing.plist
		
		*/

	public static void main(String[] args) {
		Problem problem = new Problem();
		System.out.println("Problem data is read.");
		AdvancedComputations advancedComputations = new AdvancedComputations(problem);
		System.out.println("Advanced computations complete.");
		OptimizationComputations optimizationComputations = new OptimizationComputations(problem);
		System.out.println("Optimization complete.");
	}
}

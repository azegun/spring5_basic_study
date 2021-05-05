package spring5_basic_study.di;

public class MemberInfoPrinter {
	
	private MemberDao memberDao;
	private MemberPrinter printer;
	
	public void printMemberInfo(String email) {
		Member member = memberDao.selectByEmail(email);
		if(member == null) {
			 throw new MemberNotFoundException();	
		}
		printer.print(member);
		System.out.println();
		
		
	}

	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}

}

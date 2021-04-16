package web_basic_jsp_13.erp;

import java.sql.Connection;
import java.util.List;

import web_basic_jsp_13.jndiDS;

public class TitleService {
		private Connection con = jndiDS.getConnection();
		private TitleDaoImpl dao = TitleDaoImpl.getInstance();
	
		public TitleService() {
			dao.setCon(con);
		}
		public List<Title> showTitles(){
			return dao.selectTitleByAll();
		}
		public void addTitle(Title title) {
			dao.insertTitle(title);
		}
		public void modifyTitle(Title title) {
			dao.updateTitle(title);
		}
		public void deleteTitle(Title title) {
			dao.deleteTitle(title.gettNo());
		}
		

}

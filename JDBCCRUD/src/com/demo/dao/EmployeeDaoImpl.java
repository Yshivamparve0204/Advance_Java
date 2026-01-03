package com.demo.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

import com.demo.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao{

	static Connection conn;
	static PreparedStatement ps,delemp,selemp,soremp,seempna,insemp,upsal;
	static {
		try {
			conn=DBUtil.getMyConnection();
			ps=conn.prepareStatement("select * from emp");
			delemp=conn.prepareStatement("delete from emp where empno=?");
			selemp=conn.prepareStatement("select * from emp where empno=?");
			soremp=conn.prepareStatement("select * from emp order by ename");
			seempna=conn.prepareStatement("select * from emp where ename=?");
			insemp=conn.prepareStatement("insert into emp values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			upsal=conn.prepareStatement("update emp set sal=? where empno=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public List<Employee> findAll() {
		List<Employee> elist=new ArrayList<>();
		ResultSet rs;
		try {
			rs = ps.executeQuery();
			while(rs.next()) {
				Date dt=rs.getDate(6);
				LocalDate ldt=null;
				if(dt!=null) {
					ldt=dt.toLocalDate();
				}
				Employee e=new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),ldt,rs.getDouble(7)
						,rs.getDouble(8),rs.getInt(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14));
				elist.add(e);
			}
			return elist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	@Override
	public void getCloseMyConnection() {
       DBUtil.closeMyConnection();
	}
	@Override
	public boolean removeById(int empno) {
		try {
			delemp.setInt(1, empno);
			int n=delemp.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public Employee showById(int empno) {
		try {
			selemp.setInt(1, empno);
			Employee e=null;
			ResultSet rs=selemp.executeQuery();
			while(rs.next()) {
				Date dt=rs.getDate(6);
				LocalDate ldt=null;
				if(dt!=null) {
					ldt=dt.toLocalDate();
				}
				e=new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),ldt,rs.getDouble(7)
						,rs.getDouble(8),rs.getInt(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14));
			}
			return e;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public List<Employee> getAllInSorted() {
		List<Employee> elist=new ArrayList<>();
		ResultSet rs;
		try {
			rs = soremp.executeQuery();
			while(rs.next()) {
				Date dt=rs.getDate(6);
				LocalDate ldt=null;
				if(dt!=null) {
					ldt=dt.toLocalDate();
				}
				Employee e=new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),ldt,rs.getDouble(7)
						,rs.getDouble(8),rs.getInt(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14));
				elist.add(e);
			}
			return elist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	@Override
	public List<Employee> showByName(String ename) {
		try {
			seempna.setString(1, ename);
			List<Employee> elist=new ArrayList<>();
			ResultSet rs=seempna.executeQuery();
			while(rs.next()) {
				Date dt=rs.getDate(6);
				LocalDate ldt=null;
				if(dt!=null) {
					ldt=dt.toLocalDate();
				}
				Employee e=new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),ldt,rs.getDouble(7)
						,rs.getDouble(8),rs.getInt(9),rs.getInt(10),rs.getString(11),rs.getString(12),rs.getString(13),rs.getString(14));
				elist.add(e);
			}
			return elist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
}
	@Override
	public boolean save(Employee e) {
		try {
			insemp.setInt(1,e.getEMPNO());
			insemp.setString(2, e.getENAME());
			insemp.setString(3, e.getGENDER());
			insemp.setString(4, e.getJOB());
			insemp.setInt(5, e.getMGR());
			insemp.setDate(6, Date.valueOf(e.getHIREDATE()));
			insemp.setDouble(7, e.getSAL());
			insemp.setDouble(8, e.getCOMM());
			insemp.setInt(9, e.getDEPTNO());
			insemp.setInt(10, e.getBONUSID());
			insemp.setString(11, e.getUSERNAME());
			insemp.setString(12, e.getPWD());
			insemp.setString(13, e.getPHONE());
			insemp.setString(14, e.getIsActive());
			int n=insemp.executeUpdate();
			return n>0;
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return false;
	}
	@Override
	public boolean updateSal(int empno, double sal) {
		try {
			upsal.setDouble(1, sal);
			upsal.setInt(2, empno);
			
			int n=upsal.executeUpdate();
			return n>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
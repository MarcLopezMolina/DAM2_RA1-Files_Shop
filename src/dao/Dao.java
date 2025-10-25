package dao;

import model.Employee;
import model.Product;

import java.util.ArrayList;

public interface Dao
{
	public void connect();

	public void disconnect();

	public Employee getEmployee(int employeeId, String password);

	public ArrayList<Product> getInventory();

	public boolean writeInventory(ArrayList<Product> inventario);
}
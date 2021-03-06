package main;

import bikes.BMX;
import bikes.Cruiser;
import bikes.Hybrid;
import bikes.MotorisedBike;
import bikes.MountainBike;
import bikes.RoadBike;
import customers.Customer;
import staff.Employee;
import staff.Manager;
import staff.SalesAssistant;
import suppliers.Supplier;

public class SystemData {

	private Database database;

	public SystemData(Database database) {
		this.database = database;
	}
	
	public void fillDatabase() {
		createEmployeeAccounts();
		createCustomerAccounts();
		createSupplierAccounts();
		createBicycles();
	}

	// hard code some employee accounts into database
	private void createEmployeeAccounts() {
		database.addEmployee(new SalesAssistant(10001, "Fred Flintstone", "0861234567", "password", 200004));
		database.addEmployee(new Manager(10002, "Homer Simpson", "0869876543", "password", "Dublin", "IT"));
		database.addEmployee(new Employee(10003, "Peter Griffin", "0875678987", "password"));
		database.addEmployee(new Employee(10004, "barack obama", "0851239876", "password"));
		database.addEmployee(new Employee(10005, "Bill Gates", "0835432198", "password"));
	}

	// hard code some customers accounts to the database
	private void createCustomerAccounts() {
		database.addCustomer(new Customer(1, "Tom Smith", "Bray", "0861234567","tomsmith@gmail.com"));
		database.addCustomer(new Customer(2, "John Doe", "Ringsend", "0877654321", "johndoe@gmail.com"));
		database.addCustomer(new Customer(3, "Patrick Dunne", "Sandyford", "0836543219", "paddy.dunne@yahoo.com"));
		database.addCustomer(new Customer(4, "Freddy Mercury", "Dublin", "0897654321", "freddy.mercury@hotmail.com"));
	}

	private void createSupplierAccounts() {
		database.addSupplier(new Supplier(101, "ABC Bicycle Supplies", "Dublin", "BMX","01 1234567", "abc.bike.supplies@yahoo.com"));
		database.addSupplier(new Supplier(102, "Road Bike Wholesale", "Cork", "Road bikes","021 6543212", "road.bike.wholesales@gmail.com"));
		database.addSupplier(new Supplier(103, "The Mountain Bike Shack", "Wexfor", "Mountain bikes","053 6789101", "mountainbikes@hotmail.com"));
		database.addSupplier(new Supplier(104, "City Bike Warehouse", "Wicklow", "Hybrids","0404 123456", "citybikes@yahoo.com"));
	}
	
	private void createBicycles() {
		// create bmx bikes
		database.addBicycle(new BMX("Black", "Wethepeople Justice", 21, 20, "Aluminium", database, 300, 469.95));
		database.addBicycle(new BMX("Blue", "Mongoose Scan R90", 21, 20, "Aluminium", database, 180, 299.99));
		database.addBicycle(new BMX("Black", "Giant GFR", 20, 20, "High Tensile Steel", database, 170, 300));
		
		// create Mountain bikes
		database.addBicycle(new MountainBike(27, "Kona Blast","Orange", 27, 27, "Aluminium", database, 550, 719.99));
		database.addBicycle(new MountainBike(27, "VooDoo Aizan 29er", "Black", 29, 29, "6061 Aluminium", database, 400, 565.95));
		
		// create Road bikes
		database.addBicycle(new RoadBike(18, "Boardman Road Comp", "Grey", 53, 700, "Alloy", database, 480, 649));
		
		// create Hybrid bikes
		database.addBicycle(new Hybrid(24, "Carrera Subway 1", "Black", 22, 27, "Alloy", database, 300, 479.95));
		
		// create Cruiser bikes
		database.addBicycle(new Cruiser("Red", " Schwinn Corvette", 26, 26, "Steel", database, 450, 749.99));
		
		// create Motorised bikes
		database.addBicycle(new MotorisedBike("EBCO UCL30 Electric", "Black", 21, 26, "Aluminium", database, 480, 699.99));
	}

}
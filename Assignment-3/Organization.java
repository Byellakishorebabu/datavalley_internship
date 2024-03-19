class Organization {
    private int organizationCode;
    private String organizationName;
    private String organizationAddress;

    public Organization(int organizationCode, String organizationName, String organizationAddress) {
        this.organizationCode = organizationCode;
        this.organizationName = organizationName;
        this.organizationAddress = organizationAddress;
    }

    
    public int getOrganizationCode() {
        return organizationCode;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public String getOrganizationAddress() {
        return organizationAddress;
    }


    public void printDetails() {
        System.out.println("Organization Code: " + organizationCode);
        System.out.println("Organization Name: " + organizationName);
        System.out.println("Organization Address: " + organizationAddress);

    }
}

public class Main {
    public static void main(String[] args) {
        Organization org1 = new Organization(1001, "ABC Corp", "123 Main Street");

        Organization org2 = org1.clone();

        System.out.println("Original Organization:");
        org1.printDetails();

        System.out.println("\nCloned Organization:");
        org2.printDetails();
    }
}


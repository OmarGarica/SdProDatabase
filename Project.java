import java.util.ArrayList;

public class Project {
   String address;
   int cost;
   boolean invoiceSent;
   boolean proposalSent;
   ArrayList<Worker> workers;
   Contractor contractor;

   public Project(){
      address = "Non assigned yet";
      cost = 0;
      invoiceSent = false;
      proposalSent = false;
      workers = new ArrayList<>();
      contractor = new Contractor();
   }
}

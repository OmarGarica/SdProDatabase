import java.util.ArrayList;

public class Project {
   String address;
   int cost;
   int workersAmount;
   boolean invoiceSent;
   boolean proposalSent;
   ArrayList<Worker> workers;
   Contractor contractor;
   private int counter;

   public Project(){
      address = "Non assigned yet";
      cost = 0;
      invoiceSent = false;
      proposalSent = false;
      workers = new ArrayList<>();
      contractor = new Contractor();
   }

   public Project(int cost, int workersAmount, ArrayList<Worker> workers, Contractor contractor, String address){
      this.cost = cost;
      workers = new ArrayList<>(workers);
      this.workers = workers;
      this.contractor = contractor;
      this.address = address;
   }

   public Project(int cost, int workersAmount, Contractor contractor){
      this.cost = cost;
      workers = new ArrayList<>(workersAmount);
      this.contractor = contractor;
   }

   public void setCost(int cost){
      this.cost = cost;
   }

   public void setWorkersAmount(int newWorkersAmount){
      workersAmount = newWorkersAmount;
   }

   public void setContractor(Contractor newContractor){
      contractor = newContractor;
   }

   public void setWorkersArray(ArrayList<Worker> newWorkersArray){
      workers = newWorkersArray;
   }

   public void addWorker(Worker worker){
      workers.add(worker);
   }

   @Override
   public String toString(){
      return address + "\nCost: " + cost;
   }
}

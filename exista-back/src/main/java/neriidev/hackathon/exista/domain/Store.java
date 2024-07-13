package neriidev.hackathon.exista.domain;


import lombok.Data;

@Data
public class Store{
  public String id;
  public String name;
  public String address;
  public String city;
  public String state;
  public String zipCode;
  public String phone;
  public String email;
  public String category;
  public OpeningHours openingHours;


  @Data
  public class OpeningHours{
    public String monday;
    public String tuesday;
    public String wednesday;
    public String thursday;
    public String friday;
    public String saturday;
    public String sunday;
  }
}

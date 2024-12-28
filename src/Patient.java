class Patient {
    private String name;
    private int age;
    private String gender;
    private String symptoms;
    private String treatment;
    private String appointmentDay;

    // Constructor
    public Patient(String name, int age, String gender, String symptoms) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.symptoms = symptoms;
        this.treatment = null;
        this.appointmentDay = null;
    }
    
    

    // Getter methods for name, age, gender, symptoms, treatment, appointmentDay
    // TODO

    // Setter methods for treatment, appointmentDay
    // TODO

    
    /* The below equals() and hashCode() methods are crucial for the proper functioning of 
       collections like HashSet, HashMap, and other hash-based collections. */

    public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	public String getSymptoms() {
		return symptoms;
	}



	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}



	public String getTreatment() {
		return treatment;
	}



	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}



	public String getAppointmentDay() {
		return appointmentDay;
	}



	public void setAppointmentDay(String appointmentDay) {
		this.appointmentDay = appointmentDay;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		return age == other.age && Objects.equals(appointmentDay, other.appointmentDay)
				&& Objects.equals(gender, other.gender) && Objects.equals(name, other.name)
				&& Objects.equals(symptoms, other.symptoms) && Objects.equals(treatment, other.treatment);
	}

    @Override
	public int hashCode() {
		return Objects.hash(age, appointmentDay, gender, name, symptoms, treatment);
	}

    @Override
    public String toString() {
        return "Patient{name='" + name + "', age=" + age + ", gender=" + gender + "}";
    }
}

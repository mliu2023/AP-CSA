public class SeatingChart{
  private Student[][] seats;

  public SeatingChart(List<Student> studentList, int rows, int cols){
    seats = new Student[rows][cols];
    for(int c = 0; c < cols; c++){
      for(int r = 0; r < rows; r++){
        seats[r][c] = studentList.get(r+c*rows);
      }
    }
  }

  public int removeAbsentStudent(int allowedAbsences){
    int counter = 0;
    for(int r = 0; r < seats.length; r++){
      for(int c = 0; c < seats[r].length; c++){
        Student s = seats[r][c];
        if(s.getAbsenceCount()>allowedAbsences){
          seats[r][c] = null;
          counter++;
        }
      }
    }
    return counter;
  }
}

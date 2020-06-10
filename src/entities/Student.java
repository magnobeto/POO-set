
package entities;

/**
 *
 * @author Roberto
 */
public class Student{
    
    private int userNum;

    public Student(int userNum) {
        this.userNum = userNum;
    }

    public int getUserNum() {
        return userNum;
    }

    public void setUserNum(int userNum) {
        this.userNum = userNum;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.userNum;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.userNum != other.userNum) {
            return false;
        }
        return true;
    }
}

package com.example.backend.service;

import com.example.backend.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    private final List<Student> students = new ArrayList<>();

    public StudentService() {
        generateStudents();
    }

    private void generateStudents() {
        String[] fullNames = {
                "ธนกร กุลจิต",
                "สมชาย ใจดี",
                "สุดา ศรีสุข",
                "อนันต์ ทองดี",
                "กัญญา มีทรัพย์",
                "ณัฐพงศ์ สุขใจ",
                "พิมพ์ชนก วงศา",
                "วรวุฒิ คำดี",
                "ศิริพร พรหมมา",
                "อาทิตย์ แสงแก้ว",
                "ปวีณา แก้วมณี",
                "จักรินทร์ บุญมา",
                "มณีรัตน์ ศรีวิชัย",
                "กิตติพงษ์ จันทร์หอม",
                "นภัสสร ทองสุข",
                "ธีรภัทร ใจมั่น",
                "อรทัย แสงทอง",
                "พีรพัฒน์ คงดี",
                "วรรณวิสา พรมจันทร์",
                "ศุภชัย นามวงศ์",
                "ชลธิชา สุวรรณ",
                "ภานุวัฒน์ แก่นเมือง",
                "รัตนา พูลทรัพย์",
                "เอกชัย ศรีสมบัติ",
                "ปิยธิดา จันทร์เพ็ญ",
                "กฤษดา ทองอินทร์",
                "สุนิสา คำสุข",
                "วรพล ศรีนวล",
                "จิราภรณ์ แก้วใส",
                "ธวัชชัย พันธ์ดี",
                "นฤมล สายทอง",
                "อภิชาติ บุญเกิด",
                "พรทิพย์ คำแสน",
                "สุรศักดิ์ แก้วกาญจน์",
                "อรอนงค์ ศรีจันทร์",
                "เจษฎา ทองคำ",
                "กมลวรรณ ใจกล้า",
                "ณรงค์ฤทธิ์ พรมดี",
                "ศศิธร แสงจันทร์",
                "ภูริพัฒน์ คำเมือง",
                "วราภรณ์ ทองใบ",
                "ไพศาล สุขสวัสดิ์",
                "ชนาภา ศรีทอง",
                "อัครเดช บุญช่วย",
                "เบญจพร แก้วคำ",
                "ธนภัทร คำแก้ว",
                "สุพัตรา จันทร์ดี",
                "ปริญญา ศรีบุญ",
                "กานต์พิชชา พรมสุข",
                "วีรชัย แสงสุรีย์",
                "ลลิตา คงสมบัติ",
                "ภาคิน ใจประเสริฐ",
                "เมธาวี ทองประดับ",
                "ณัฐวุฒิ คำหอม",
                "พัชรินทร์ ศรีแก้ว",
                "สิทธิชัย พูลผล",
                "อัญชลี แก้วเมือง",
                "ภัทรพล จันทร์ศรี",
                "นิภาพร บุญล้อม",
                "วุฒิชัย ทองแท้",
                "อารีรัตน์ คำอินทร์",
                "ก้องภพ ศรีมงคล",
                "สโรชา แสงอรุณ",
                "ธีรยุทธ บุญรักษา",
                "นัทธมน พรหมรักษ์",
                "รณชัย คำปัน",
                "มนัสนันท์ แก้วสุวรรณ",
                "ปกรณ์ ศรีสะอาด",
                "จุฑามาศ ทองเจริญ",
                "อดิศร บุญเรือง",
                "กุลธิดา คำไชย",
                "ศราวุธ แสงชัย",
                "นงนภัส พูลเพิ่ม",
                "ธนวัฒน์ สุขเกษม",
                "ปิยะพร ศรีหอม",
                "เกรียงไกร จันทร์เมือง",
                "อาภัสรา ทองสิงห์",
                "ณัฐพล ใจสัตย์",
                "พรพิมล แสงเพชร",
                "สรวิชญ์ คำดี",
                "วรัญญา บุญศรี",
                "ชัยวัฒน์ ศรีประเสริฐ",
                "จิราพร ทองมี",
                "พศิน แก้ววัฒนา",
                "อริสา คำสิงห์",
                "ธนดล พรหมจันทร์",
                "สุชาดา ศรีบุญเรือง",
                "ภัทรดนัย แสงทองดี",
                "กฤตยา ใจงาม",
                "อนุชา ทองคำดี",
                "ปุณณภา คำเจริญ",
                "ศิวกร แก้วประดับ",
                "รัชนีกร บุญธรรม",
                "นราธิป ศรีแก่น",
                "ชุติมา แสงมณี",
                "วรเมธ คำประเสริฐ",
                "กมลชนก ทองสุขดี",
                "พงศกร ศรีสุขใจ",
                "มัลลิกา บุญสม",
                "ธนินท์ แก้วพัฒนา"
        };

        String[] majors = {
                "วิทยาการคอมพิวเตอร์",
                "เทคโนโลยีสารสนเทศ",
                "วิศวกรรมซอฟต์แวร์",
                "คอมพิวเตอร์ธุรกิจ",
                "วิทยาการข้อมูล"
        };

        for (int i = 1; i <= 100; i++) {
            String studentCode = "STD" + String.format("%03d", i);

            String fullName = fullNames[i - 1];

            String major = majors[(i - 1) % majors.length];

            int year = ((i - 1) % 4) + 1;

            String email = studentCode.toLowerCase() + "@example.com";

            students.add(new Student(
                    i,
                    studentCode,
                    fullName,
                    major,
                    year,
                    email));
        }
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public List<Student> searchStudents(String keyword) {
        if (keyword == null || keyword.trim().isEmpty()) {
            return students;
        }

        String searchText = keyword.toLowerCase();

        return students.stream()
                .filter(student -> String.valueOf(student.getId()).contains(searchText)
                        || student.getStudentCode().toLowerCase().contains(searchText)
                        || student.getFullName().toLowerCase().contains(searchText)
                        || student.getMajor().toLowerCase().contains(searchText)
                        || String.valueOf(student.getYear()).contains(searchText)
                        || student.getEmail().toLowerCase().contains(searchText))
                .toList();
    }

    public Student getStudentById(int id) {
        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
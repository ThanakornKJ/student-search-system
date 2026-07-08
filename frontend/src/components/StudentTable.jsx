function StudentTable({ students, loading }) {
  return (
    <div className="table-wrapper">
      <table>
        <thead>
          <tr>
            <th>ลำดับ</th>
            <th>รหัสนักศึกษา</th>
            <th>ชื่อ - นามสกุล</th>
            <th>สาขา</th>
            <th>ชั้นปี</th>
            <th>อีเมล</th>
          </tr>
        </thead>

        <tbody>
          {loading ? (
            <tr>
              <td colSpan="6" className="loading-data">
                กำลังโหลดข้อมูล...
              </td>
            </tr>
          ) : students.length === 0 ? (
            <tr>
              <td colSpan="6" className="no-data">
                ไม่พบนักศึกษาที่ค้นหา
              </td>
            </tr>
          ) : (
            students.map((student, index) => (
              <tr key={student.id}>
                <td>{index + 1}</td>
                <td>{student.studentCode}</td>
                <td>{student.fullName}</td>
                <td>{student.major}</td>
                <td>ปี {student.year}</td>
                <td>{student.email}</td>
              </tr>
            ))
          )}
        </tbody>
      </table>
    </div>
  );
}

export default StudentTable;
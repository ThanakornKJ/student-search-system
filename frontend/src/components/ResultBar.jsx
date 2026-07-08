function ResultBar({ loading, count }) {
  return (
    <div className="result-bar">
      {loading ? (
        <span>กำลังโหลดข้อมูล...</span>
      ) : (
        <span>พบนักศึกษาทั้งหมด {count} คน</span>
      )}
    </div>
  );
}

export default ResultBar;
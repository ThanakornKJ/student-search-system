const API_URL = "http://localhost:8080/api/students";

export async function getStudents(keyword = "") {
  let url = API_URL;

  if (keyword.trim() !== "") {
    url = `${API_URL}?keyword=${encodeURIComponent(keyword)}`;
  }

  const response = await fetch(url);

  if (!response.ok) {
    throw new Error("โหลดข้อมูลนักศึกษาไม่สำเร็จ");
  }

  return await response.json();
}
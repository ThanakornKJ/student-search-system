import { useEffect, useState } from "react";
import "./App.css";

import SearchBox from "./components/SearchBox";
import ResultBar from "./components/ResultBar";
import ErrorMessage from "./components/ErrorMessage";
import StudentTable from "./components/StudentTable";

import { getStudents } from "./services/studentService";

function App() {
  const [students, setStudents] = useState([]);
  const [keyword, setKeyword] = useState("");
  const [loading, setLoading] = useState(false);
  const [errorMessage, setErrorMessage] = useState("");

  const loadStudents = async (searchKeyword = "") => {
    setLoading(true);
    setErrorMessage("");

    try {
      const data = await getStudents(searchKeyword);
      setStudents(data);
    } catch (error) {
      setErrorMessage(error.message);
      setStudents([]);
    } finally {
      setLoading(false);
    }
  };

  useEffect(() => {
    loadStudents();
  }, []);

  const handleSearch = () => {
    loadStudents(keyword);
  };

  const handleReset = () => {
    setKeyword("");
    loadStudents();
  };

  return (
    <div className="page">
      <div className="container">
        <h1>ระบบค้นหานักศึกษา</h1>

        <p className="subtitle">
          React Frontend เชื่อมต่อกับ Spring Boot Backend
        </p>

        <SearchBox
          keyword={keyword}
          setKeyword={setKeyword}
          onSearch={handleSearch}
          onReset={handleReset}
        />

        <ResultBar loading={loading} count={students.length} />

        <ErrorMessage message={errorMessage} />

        <StudentTable students={students} loading={loading} />
      </div>
    </div>
  );
}

export default App;
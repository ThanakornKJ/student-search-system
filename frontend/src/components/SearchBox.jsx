function SearchBox({ keyword, setKeyword, onSearch, onReset }) {
  const handleKeyDown = (event) => {
    if (event.key === "Enter") {
      onSearch();
    }
  };

  return (
    <div className="search-box">
      <input
        type="text"
        placeholder="ค้นหาจากรหัส ชื่อ สาขา ชั้นปี หรืออีเมล"
        value={keyword}
        onChange={(event) => setKeyword(event.target.value)}
        onKeyDown={handleKeyDown}
      />

      <button onClick={onSearch}>ค้นหา</button>

      <button className="reset-btn" onClick={onReset}>
        ล้างค้นหา
      </button>
    </div>
  );
}

export default SearchBox;
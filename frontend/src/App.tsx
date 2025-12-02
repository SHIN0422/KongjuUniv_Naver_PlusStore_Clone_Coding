import { useEffect, useState } from "react";

function App() {
    const [message, setMessage] = useState<string>("로딩 중...");

    useEffect(() => {
        // 스프링부트 API 호출
        fetch("http://localhost:8080/api/hello")
            .then((res) => res.text()) // 위에서 String을 리턴하니까 text()로
            .then((data) => setMessage(data))
            .catch((err) => {
                console.error(err);
                setMessage("에러 발생: " + err);
            });
    }, []);

    return (
        <div style={{ padding: "2rem", color: "white" }}>
            <h1>React ↔ Spring Boot 테스트</h1>
            <p>백엔드에서 온 메시지: {message}</p>
        </div>
    );
}

export default App;

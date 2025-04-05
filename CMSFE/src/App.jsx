import { useState } from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom'; // Use Routes instead of Switch
import reactLogo from './assets/react.svg';
import viteLogo from '/vite.svg';
import './App.css';
import 'bulma/css/bulma.min.css';
import NavBar from './NavBar';
import Services from './Services';
import CreateServiceForm from './CreateServiceForm';

function App() {
  const [count, setCount] = useState(0);

  return (
    <Router>
      <NavBar /> {/* The NavBar remains the same */}
      <div
        style={{
          paddingTop: '6rem',
          paddingLeft: '1rem',
          paddingRight: '1rem',
          paddingBottom: '1rem',
        }}
      >
        {/* Updated to use Routes instead of Switch */}
        <Routes>
          <Route path="/create-service" element={<CreateServiceForm />} />
          <Route path="/view-services" element={<Services />} />
          <Route path="/" element={
            <div className='content' style={{paddingLeft: '10rem',
              paddingRight: '10rem'}}>
              <h1 className="title is-2 has-text-centered">Welcome to the Crisis Management System</h1>
              <p>
              Process-Aware Information System for Crisis Management aims to assist in managing crisis situations, 
              specifically focused on flood response, by providing a structured, process-oriented information system. 
              This system is designed to coordinate the various actors involved in crisis management, such as the Prefect, local mayors, police, 
              and emergency services.
              The project focuses on a scenario where the city of Blois is facing severe flooding. 
              The system will help the Prefect oversee and coordinate various tasks, including alerting local authorities, 
              managing communication efforts, conducting damage assessments, and ensuring the safety and well-being of affected populations. 
              The goal is to streamline the response, from initial alerts and evacuations to long-term recovery efforts, 
              by tracking the execution of services and activities in real-time. This ensures a more effective and timely crisis management approach, 
              minimizing damage and facilitating recovery.
              </p>
            </div>
            } />
        </Routes>
      </div>
    </Router>
  );
}

export default App;

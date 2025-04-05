import React, { useEffect, useState } from 'react';
import './Services.css';

const Services = () => {
  const [services, setServices] = useState([]);
  const [loading, setLoading] = useState(true);

  useEffect(() => {
    fetch('http://localhost:8080/service/getServices')
      .then((res) => res.json())
      .then((data) => {
        setServices(data);
        setLoading(false);
      })
      .catch((error) => {
        console.error('Error fetching services:', error);
        setLoading(false);
      });
  }, []);

  return (
    <div className="container mt-5">
      <h2 className="title is-2 has-text-centered">Registered Services</h2>
      {loading ? (
        <p>Loading...</p>
      ) : services.length === 0 ? (
        <p className="has-text-centered">There is no service registered on the DB</p>
      ) : (
        <ul>
          {services.map((service) => (
            <li key={service.id} className="mb-4">
              <div className="card is-shadowless service-card">
                <div className="card-content">
                  <h3 className="title is-5">{service.title}</h3>
                  <p><strong>Type:</strong> {service.type}</p>
                  <p><strong>Duration:</strong> {service.serviceTime} minutes</p>
                  <p><strong>Cost:</strong> ${service.serviceCost.toFixed(2)}</p>
                </div>
              </div>
            </li>
          ))}
        </ul>
      )}
    </div>
  );
};

export default Services;

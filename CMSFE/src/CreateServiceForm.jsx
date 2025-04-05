import React, { useState } from 'react';

const CreateServiceForm = () => {
  const [formData, setFormData] = useState({
    serviceName: '',
    type: '',
    serviceTime: '',
    serviceCost: '',
  });

  const [errors, setErrors] = useState({
    serviceName: '',
    type: '',
    serviceTime: '',
    serviceCost: '',
  });

  const handleInputChange = (e) => {
    const { name, value } = e.target;
    setFormData((prevData) => ({
      ...prevData,
      [name]: value,
    }));
  };

  const validateForm = () => {
    const newErrors = {};

    if (!formData.serviceName) {
      newErrors.serviceName = 'Service Name is required.';
    }

    if (!formData.type) {
      newErrors.type = 'Type is required.';
    }

    if (!formData.serviceTime || isNaN(formData.serviceTime) || parseInt(formData.serviceTime) < 0) {
      newErrors.serviceTime = 'Service Time is required and must be a valid positive integer.';
    }

    if (!formData.serviceCost || isNaN(formData.serviceCost)) {
      newErrors.serviceCost = 'Service Cost is required and must be a valid number.';
    }

    setErrors(newErrors);
    return Object.keys(newErrors).length === 0;
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    if (validateForm()) {
      const payload = {
        service_name: formData.serviceName,
        service_type: formData.type,
        service_time: parseInt(formData.serviceTime),
        service_cost: parseFloat(formData.serviceCost),
      };
  
      try {
        const response = await fetch('http://localhost:8080/service/create', {
          method: 'POST',
          headers: {
            'Content-Type': 'application/json',
          },
          body: JSON.stringify(payload),
        });
  
        if (!response.ok) {
          throw new Error('Failed to create service');
        }
  
        const result = await response.json();
        console.log('Service created successfully:', result);
  
        // Optional: reset form
        setFormData({
          serviceName: '',
          type: '',
          serviceTime: '',
          serviceCost: '',
        });
  
        alert('Service created successfully!');
      } catch (error) {
        console.error('Error submitting form:', error);
        alert('Error creating service. Please try again.');
      }
    }
  };

  return (
    <div className="container mt-5">
      <h2 className="title is-2 has-text-centered">Create a New Service</h2>
      <form onSubmit={handleSubmit}>
        {/* Service Name */}
        <div className="field">
          <label className="label">Service Name</label>
          <div className="control">
            <input
              type="text"
              className={`input ${errors.serviceName ? 'is-danger' : ''}`}
              name="serviceName"
              value={formData.serviceName}
              onChange={handleInputChange}
              placeholder="Enter service name"
            />
          </div>
          {errors.serviceName && <p className="help is-danger">{errors.serviceName}</p>}
        </div>

        {/* Type */}
        <div className="field">
          <label className="label">Type</label>
          <div className="control">
            <input
              type="text"
              className={`input ${errors.type ? 'is-danger' : ''}`}
              name="type"
              value={formData.type}
              onChange={handleInputChange}
              placeholder="Enter service type"
            />
          </div>
          {errors.type && <p className="help is-danger">{errors.type}</p>}
        </div>

        {/* Service Time as Integer */}
        <div className="field">
          <label className="label">Service Duration (in minutes)</label>
          <div className="control">
            <input
              type="number"
              className={`input ${errors.serviceTime ? 'is-danger' : ''}`}
              name="serviceTime"
              value={formData.serviceTime}
              onChange={handleInputChange}
              placeholder="Enter duration in minutes"
              min="0"
            />
          </div>
          {errors.serviceTime && <p className="help is-danger">{errors.serviceTime}</p>}
        </div>

        {/* Service Cost */}
        <div className="field">
          <label className="label">Service Cost</label>
          <div className="control">
            <input
              type="number"
              step="0.01"
              className={`input ${errors.serviceCost ? 'is-danger' : ''}`}
              name="serviceCost"
              value={formData.serviceCost}
              onChange={handleInputChange}
              placeholder="Enter service cost"
            />
          </div>
          {errors.serviceCost && <p className="help is-danger">{errors.serviceCost}</p>}
        </div>

        {/* Submit Button */}
        <div className="field">
          <div className="control">
            <button type="submit" className="button is-primary is-fullwidth">
              Create Service
            </button>
          </div>
        </div>
      </form>
    </div>
  );
};

export default CreateServiceForm;

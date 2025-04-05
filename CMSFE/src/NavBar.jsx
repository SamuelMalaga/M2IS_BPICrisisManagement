import React, { useState } from 'react';
import { NavLink } from 'react-router-dom'; // Import NavLink from react-router-dom

const NavBar = () => {
  const [isActive, setIsActive] = useState(false);

  const toggleDropdown = () => {
    setIsActive(!isActive);
  };

  return (
    <nav className="navbar is-primary is-fixed-top" role="navigation" aria-label="main navigation">
      <div className="navbar-brand">
        <a className="navbar-item" href="/">
          <strong>Crisis Management System</strong>
        </a>
      </div>

      <div className="navbar-menu">
        <div className="navbar-start">
          <div className="navbar-item has-dropdown is-hoverable">
            <a className="navbar-link" onClick={toggleDropdown}>
              Services
            </a>

            <div className={`navbar-dropdown ${isActive ? 'is-active' : ''}`}>
              <NavLink
                to="/create-service"
                className="navbar-item"
                activeClassName="is-active"
              >
                Create a Service
              </NavLink>
              <NavLink
                to="/view-services"
                className="navbar-item"
                activeClassName="is-active"
              >
                View Services
              </NavLink>
            </div>
          </div>
        </div>

        <div className="navbar-end"></div>
      </div>
    </nav>
  );
};

export default NavBar;

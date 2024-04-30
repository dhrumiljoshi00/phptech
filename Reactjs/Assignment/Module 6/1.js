// src/Admin/AdminHome.js
import React from 'react';

const AdminHome = () => {
  return (
    <div>
      <h2>Admin Home</h2>
      {/* Add more admin-related components */}
    </div>
  );
};

export default AdminHome;


// src/App.js
import React, { Suspense } from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';

const AdminHome = React.lazy(() => import('./Admin/AdminHome'));
const UserHome = React.lazy(() => import('./User/UserHome'));

const App = () => {
  return (
    <Router>
      <Suspense fallback={<div>Loading...</div>}>
        <Switch>
          <Route path="/admin" component={AdminHome} />
          <Route path="/user" component={UserHome} />
          {/* Add more routes for Admin and User modules */}
        </Switch>
      </Suspense>
    </Router>
  );
};

export default App;

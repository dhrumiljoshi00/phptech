import React from 'react';

class ListView extends React.Component {
  render() {
    // Sample data
    const items = ['Item 1', 'Item 2', 'Item 3', 'Item 4'];

    return (
      <div>
        <h1>List View</h1>
        <ul>
          {items.map((item, index) => (
            <li key={index}>{item}</li>
          ))}
        </ul>
      </div>
    );
  }
}

export default ListView;

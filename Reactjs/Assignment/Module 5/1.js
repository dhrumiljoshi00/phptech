import React from 'react';
import styled from 'styled-components';

// Styled Components
const Container = styled.div`
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  height: 100vh;
`;

const Title = styled.h1`
  font-size: 2.5rem;
  margin-bottom: 2rem;
`;

const Button = styled.button`
  padding: 1rem 2rem;
  font-size: 1.2rem;
  border: none;
  border-radius: 5px;
  background-color: #007bff;
  color: #fff;
  cursor: pointer;
  transition: background-color 0.3s ease;

  &:hover {
    background-color: #0056b3;
  }
`;

// Component
const HomePage = () => {
  return (
    <Container>
      <Title>Welcome to our Shopping Site</Title>
      <Button>Shop Now</Button>
    </Container>
  );
};

export default HomePage;

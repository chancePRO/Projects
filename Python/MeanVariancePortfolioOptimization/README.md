# Mean-Variance Portfolio Optimization with Stress Testing

This notebook demonstrates a basic mean-variance portfolio optimization using historical
prices from Yahoo Finance. It uses `cvxpy` to compute optimal weights under different
risk-aversion levels and simulates 2008 and 2020 crash scenarios by reducing returns
during those periods.

## Requirements

- pandas
- numpy
- yfinance
- matplotlib
- cvxpy

## Usage

Open the notebook in Jupyter and run all cells to download data for a basket of large-cap
US stocks, produce a plot of the efficient frontier, and save bar charts of the optimal
allocations for baseline and stressed scenarios.

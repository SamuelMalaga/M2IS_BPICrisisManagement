import pandas as pd
import Levenshtein

df = pd.read_csv(
    "cleaned_logfile.csv",
    sep=";",
    encoding="utf-8"
)


# print("Raw df head\n")

# print(df.columns.values)

# print(df.head()['activity'])

df["activity_code"] = df["activity"].str.split(":").str[0]

# print(df.head()['activity_code'])

mapping = {f"S{i}": chr(65 + i - 1) for i in range(1, 27)}  # Maps S1 -> A, S2 -> B, ..., S26 -> Z
df["activity_mapped"] = df["activity_code"].map(mapping)

# print(df['activity_mapped'].nunique())
df["activity_mapped"] = df["activity_mapped"].fillna("")  # Replace NaN with empty strings
df_trace = df.groupby("case_id")["activity_mapped"].agg(lambda x: "".join(x.dropna())).reset_index()
df_trace.rename(columns={"activity_mapped": "trace"}, inplace=True)

normal_cases = [196, 162, 202]

normal_traces_df = df_trace[df_trace["case_id"].isin(normal_cases)]

print(df_trace[df_trace["case_id"].isin(normal_cases)])

new_trace = "BCEFGKLNOPQR"

distances = {
    row["case_id"]: Levenshtein.distance(new_trace, row["trace"]) 
    for _, row in normal_traces_df.iterrows()
}

# Print the distances
for case_id, distance in distances.items():
    print(f"Levenshtein distance to case {case_id}: {distance}")


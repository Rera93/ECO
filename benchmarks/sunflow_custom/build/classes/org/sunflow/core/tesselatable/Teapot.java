package org.sunflow.core.tesselatable;
public class Teapot extends BezierMesh {
    private static final float[][] PATCHES = { { -80.0F, 0.0F, 30.0F, -80.0F,
    -44.8F,
    30.0F,
    -44.8F,
    -80.0F,
    30.0F,
    0.0F,
    -80.0F,
    30.0F,
    -80.0F,
    0.0F,
    12.0F,
    -80.0F,
    -44.8F,
    12.0F,
    -44.8F,
    -80.0F,
    12.0F,
    0.0F,
    -80.0F,
    12.0F,
    -60.0F,
    0.0F,
    3.0F,
    -60.0F,
    -33.6F,
    3.0F,
    -33.6F,
    -60.0F,
    3.0F,
    0.0F,
    -60.0F,
    3.0F,
    -60.0F,
    0.0F,
    0.0F,
    -60.0F,
    -33.6F,
    0.0F,
    -33.6F,
    -60.0F,
    0.0F,
    0.0F,
    -60.0F,
    0.0F },
    { 0.0F,
    -80.0F,
    30.0F,
    44.8F,
    -80.0F,
    30.0F,
    80.0F,
    -44.8F,
    30.0F,
    80.0F,
    0.0F,
    30.0F,
    0.0F,
    -80.0F,
    12.0F,
    44.8F,
    -80.0F,
    12.0F,
    80.0F,
    -44.8F,
    12.0F,
    80.0F,
    0.0F,
    12.0F,
    0.0F,
    -60.0F,
    3.0F,
    33.6F,
    -60.0F,
    3.0F,
    60.0F,
    -33.6F,
    3.0F,
    60.0F,
    0.0F,
    3.0F,
    0.0F,
    -60.0F,
    0.0F,
    33.6F,
    -60.0F,
    0.0F,
    60.0F,
    -33.6F,
    0.0F,
    60.0F,
    0.0F,
    0.0F },
    { -60.0F,
    0.0F,
    90.0F,
    -60.0F,
    -33.6F,
    90.0F,
    -33.6F,
    -60.0F,
    90.0F,
    0.0F,
    -60.0F,
    90.0F,
    -70.0F,
    0.0F,
    69.0F,
    -70.0F,
    -39.2F,
    69.0F,
    -39.2F,
    -70.0F,
    69.0F,
    0.0F,
    -70.0F,
    69.0F,
    -80.0F,
    0.0F,
    48.0F,
    -80.0F,
    -44.8F,
    48.0F,
    -44.8F,
    -80.0F,
    48.0F,
    0.0F,
    -80.0F,
    48.0F,
    -80.0F,
    0.0F,
    30.0F,
    -80.0F,
    -44.8F,
    30.0F,
    -44.8F,
    -80.0F,
    30.0F,
    0.0F,
    -80.0F,
    30.0F },
    { 0.0F,
    -60.0F,
    90.0F,
    33.6F,
    -60.0F,
    90.0F,
    60.0F,
    -33.6F,
    90.0F,
    60.0F,
    0.0F,
    90.0F,
    0.0F,
    -70.0F,
    69.0F,
    39.2F,
    -70.0F,
    69.0F,
    70.0F,
    -39.2F,
    69.0F,
    70.0F,
    0.0F,
    69.0F,
    0.0F,
    -80.0F,
    48.0F,
    44.8F,
    -80.0F,
    48.0F,
    80.0F,
    -44.8F,
    48.0F,
    80.0F,
    0.0F,
    48.0F,
    0.0F,
    -80.0F,
    30.0F,
    44.8F,
    -80.0F,
    30.0F,
    80.0F,
    -44.8F,
    30.0F,
    80.0F,
    0.0F,
    30.0F },
    { -56.0F,
    0.0F,
    90.0F,
    -56.0F,
    -31.36F,
    90.0F,
    -31.36F,
    -56.0F,
    90.0F,
    0.0F,
    -56.0F,
    90.0F,
    -53.5F,
    0.0F,
    95.25F,
    -53.5F,
    -29.96F,
    95.25F,
    -29.96F,
    -53.5F,
    95.25F,
    0.0F,
    -53.5F,
    95.25F,
    -57.5F,
    0.0F,
    95.25F,
    -57.5F,
    -32.2F,
    95.25F,
    -32.2F,
    -57.5F,
    95.25F,
    0.0F,
    -57.5F,
    95.25F,
    -60.0F,
    0.0F,
    90.0F,
    -60.0F,
    -33.6F,
    90.0F,
    -33.6F,
    -60.0F,
    90.0F,
    0.0F,
    -60.0F,
    90.0F },
    { 0.0F,
    -56.0F,
    90.0F,
    31.36F,
    -56.0F,
    90.0F,
    56.0F,
    -31.36F,
    90.0F,
    56.0F,
    0.0F,
    90.0F,
    0.0F,
    -53.5F,
    95.25F,
    29.96F,
    -53.5F,
    95.25F,
    53.5F,
    -29.96F,
    95.25F,
    53.5F,
    0.0F,
    95.25F,
    0.0F,
    -57.5F,
    95.25F,
    32.2F,
    -57.5F,
    95.25F,
    57.5F,
    -32.2F,
    95.25F,
    57.5F,
    0.0F,
    95.25F,
    0.0F,
    -60.0F,
    90.0F,
    33.6F,
    -60.0F,
    90.0F,
    60.0F,
    -33.6F,
    90.0F,
    60.0F,
    0.0F,
    90.0F },
    { 80.0F,
    0.0F,
    30.0F,
    80.0F,
    44.8F,
    30.0F,
    44.8F,
    80.0F,
    30.0F,
    0.0F,
    80.0F,
    30.0F,
    80.0F,
    0.0F,
    12.0F,
    80.0F,
    44.8F,
    12.0F,
    44.8F,
    80.0F,
    12.0F,
    0.0F,
    80.0F,
    12.0F,
    60.0F,
    0.0F,
    3.0F,
    60.0F,
    33.6F,
    3.0F,
    33.6F,
    60.0F,
    3.0F,
    0.0F,
    60.0F,
    3.0F,
    60.0F,
    0.0F,
    0.0F,
    60.0F,
    33.6F,
    0.0F,
    33.6F,
    60.0F,
    0.0F,
    0.0F,
    60.0F,
    0.0F },
    { 0.0F,
    80.0F,
    30.0F,
    -44.8F,
    80.0F,
    30.0F,
    -80.0F,
    44.8F,
    30.0F,
    -80.0F,
    0.0F,
    30.0F,
    0.0F,
    80.0F,
    12.0F,
    -44.8F,
    80.0F,
    12.0F,
    -80.0F,
    44.8F,
    12.0F,
    -80.0F,
    0.0F,
    12.0F,
    0.0F,
    60.0F,
    3.0F,
    -33.6F,
    60.0F,
    3.0F,
    -60.0F,
    33.6F,
    3.0F,
    -60.0F,
    0.0F,
    3.0F,
    0.0F,
    60.0F,
    0.0F,
    -33.6F,
    60.0F,
    0.0F,
    -60.0F,
    33.6F,
    0.0F,
    -60.0F,
    0.0F,
    0.0F },
    { 60.0F,
    0.0F,
    90.0F,
    60.0F,
    33.6F,
    90.0F,
    33.6F,
    60.0F,
    90.0F,
    0.0F,
    60.0F,
    90.0F,
    70.0F,
    0.0F,
    69.0F,
    70.0F,
    39.2F,
    69.0F,
    39.2F,
    70.0F,
    69.0F,
    0.0F,
    70.0F,
    69.0F,
    80.0F,
    0.0F,
    48.0F,
    80.0F,
    44.8F,
    48.0F,
    44.8F,
    80.0F,
    48.0F,
    0.0F,
    80.0F,
    48.0F,
    80.0F,
    0.0F,
    30.0F,
    80.0F,
    44.8F,
    30.0F,
    44.8F,
    80.0F,
    30.0F,
    0.0F,
    80.0F,
    30.0F },
    { 0.0F,
    60.0F,
    90.0F,
    -33.6F,
    60.0F,
    90.0F,
    -60.0F,
    33.6F,
    90.0F,
    -60.0F,
    0.0F,
    90.0F,
    0.0F,
    70.0F,
    69.0F,
    -39.2F,
    70.0F,
    69.0F,
    -70.0F,
    39.2F,
    69.0F,
    -70.0F,
    0.0F,
    69.0F,
    0.0F,
    80.0F,
    48.0F,
    -44.8F,
    80.0F,
    48.0F,
    -80.0F,
    44.8F,
    48.0F,
    -80.0F,
    0.0F,
    48.0F,
    0.0F,
    80.0F,
    30.0F,
    -44.8F,
    80.0F,
    30.0F,
    -80.0F,
    44.8F,
    30.0F,
    -80.0F,
    0.0F,
    30.0F },
    { 56.0F,
    0.0F,
    90.0F,
    56.0F,
    31.36F,
    90.0F,
    31.36F,
    56.0F,
    90.0F,
    0.0F,
    56.0F,
    90.0F,
    53.5F,
    0.0F,
    95.25F,
    53.5F,
    29.96F,
    95.25F,
    29.96F,
    53.5F,
    95.25F,
    0.0F,
    53.5F,
    95.25F,
    57.5F,
    0.0F,
    95.25F,
    57.5F,
    32.2F,
    95.25F,
    32.2F,
    57.5F,
    95.25F,
    0.0F,
    57.5F,
    95.25F,
    60.0F,
    0.0F,
    90.0F,
    60.0F,
    33.6F,
    90.0F,
    33.6F,
    60.0F,
    90.0F,
    0.0F,
    60.0F,
    90.0F },
    { 0.0F,
    56.0F,
    90.0F,
    -31.36F,
    56.0F,
    90.0F,
    -56.0F,
    31.36F,
    90.0F,
    -56.0F,
    0.0F,
    90.0F,
    0.0F,
    53.5F,
    95.25F,
    -29.96F,
    53.5F,
    95.25F,
    -53.5F,
    29.96F,
    95.25F,
    -53.5F,
    0.0F,
    95.25F,
    0.0F,
    57.5F,
    95.25F,
    -32.2F,
    57.5F,
    95.25F,
    -57.5F,
    32.2F,
    95.25F,
    -57.5F,
    0.0F,
    95.25F,
    0.0F,
    60.0F,
    90.0F,
    -33.6F,
    60.0F,
    90.0F,
    -60.0F,
    33.6F,
    90.0F,
    -60.0F,
    0.0F,
    90.0F },
    { -64.0F,
    0.0F,
    75.0F,
    -64.0F,
    12.0F,
    75.0F,
    -60.0F,
    12.0F,
    84.0F,
    -60.0F,
    0.0F,
    84.0F,
    -92.0F,
    0.0F,
    75.0F,
    -92.0F,
    12.0F,
    75.0F,
    -100.0F,
    12.0F,
    84.0F,
    -100.0F,
    0.0F,
    84.0F,
    -108.0F,
    0.0F,
    75.0F,
    -108.0F,
    12.0F,
    75.0F,
    -120.0F,
    12.0F,
    84.0F,
    -120.0F,
    0.0F,
    84.0F,
    -108.0F,
    0.0F,
    66.0F,
    -108.0F,
    12.0F,
    66.0F,
    -120.0F,
    12.0F,
    66.0F,
    -120.0F,
    0.0F,
    66.0F },
    { -60.0F,
    0.0F,
    84.0F,
    -60.0F,
    -12.0F,
    84.0F,
    -64.0F,
    -12.0F,
    75.0F,
    -64.0F,
    0.0F,
    75.0F,
    -100.0F,
    0.0F,
    84.0F,
    -100.0F,
    -12.0F,
    84.0F,
    -92.0F,
    -12.0F,
    75.0F,
    -92.0F,
    0.0F,
    75.0F,
    -120.0F,
    0.0F,
    84.0F,
    -120.0F,
    -12.0F,
    84.0F,
    -108.0F,
    -12.0F,
    75.0F,
    -108.0F,
    0.0F,
    75.0F,
    -120.0F,
    0.0F,
    66.0F,
    -120.0F,
    -12.0F,
    66.0F,
    -108.0F,
    -12.0F,
    66.0F,
    -108.0F,
    0.0F,
    66.0F },
    { -108.0F,
    0.0F,
    66.0F,
    -108.0F,
    12.0F,
    66.0F,
    -120.0F,
    12.0F,
    66.0F,
    -120.0F,
    0.0F,
    66.0F,
    -108.0F,
    0.0F,
    57.0F,
    -108.0F,
    12.0F,
    57.0F,
    -120.0F,
    12.0F,
    48.0F,
    -120.0F,
    0.0F,
    48.0F,
    -100.0F,
    0.0F,
    39.0F,
    -100.0F,
    12.0F,
    39.0F,
    -106.0F,
    12.0F,
    31.5F,
    -106.0F,
    0.0F,
    31.5F,
    -80.0F,
    0.0F,
    30.0F,
    -80.0F,
    12.0F,
    30.0F,
    -76.0F,
    12.0F,
    18.0F,
    -76.0F,
    0.0F,
    18.0F },
    { -120.0F,
    0.0F,
    66.0F,
    -120.0F,
    -12.0F,
    66.0F,
    -108.0F,
    -12.0F,
    66.0F,
    -108.0F,
    0.0F,
    66.0F,
    -120.0F,
    0.0F,
    48.0F,
    -120.0F,
    -12.0F,
    48.0F,
    -108.0F,
    -12.0F,
    57.0F,
    -108.0F,
    0.0F,
    57.0F,
    -106.0F,
    0.0F,
    31.5F,
    -106.0F,
    -12.0F,
    31.5F,
    -100.0F,
    -12.0F,
    39.0F,
    -100.0F,
    0.0F,
    39.0F,
    -76.0F,
    0.0F,
    18.0F,
    -76.0F,
    -12.0F,
    18.0F,
    -80.0F,
    -12.0F,
    30.0F,
    -80.0F,
    0.0F,
    30.0F },
    { 68.0F,
    0.0F,
    51.0F,
    68.0F,
    26.4F,
    51.0F,
    68.0F,
    26.4F,
    18.0F,
    68.0F,
    0.0F,
    18.0F,
    104.0F,
    0.0F,
    51.0F,
    104.0F,
    26.4F,
    51.0F,
    124.0F,
    26.4F,
    27.0F,
    124.0F,
    0.0F,
    27.0F,
    92.0F,
    0.0F,
    78.0F,
    92.0F,
    10.0F,
    78.0F,
    96.0F,
    10.0F,
    75.0F,
    96.0F,
    0.0F,
    75.0F,
    108.0F,
    0.0F,
    90.0F,
    108.0F,
    10.0F,
    90.0F,
    132.0F,
    10.0F,
    90.0F,
    132.0F,
    0.0F,
    90.0F },
    { 68.0F,
    0.0F,
    18.0F,
    68.0F,
    -26.4F,
    18.0F,
    68.0F,
    -26.4F,
    51.0F,
    68.0F,
    0.0F,
    51.0F,
    124.0F,
    0.0F,
    27.0F,
    124.0F,
    -26.4F,
    27.0F,
    104.0F,
    -26.4F,
    51.0F,
    104.0F,
    0.0F,
    51.0F,
    96.0F,
    0.0F,
    75.0F,
    96.0F,
    -10.0F,
    75.0F,
    92.0F,
    -10.0F,
    78.0F,
    92.0F,
    0.0F,
    78.0F,
    132.0F,
    0.0F,
    90.0F,
    132.0F,
    -10.0F,
    90.0F,
    108.0F,
    -10.0F,
    90.0F,
    108.0F,
    0.0F,
    90.0F },
    { 108.0F,
    0.0F,
    90.0F,
    108.0F,
    10.0F,
    90.0F,
    132.0F,
    10.0F,
    90.0F,
    132.0F,
    0.0F,
    90.0F,
    112.0F,
    0.0F,
    93.0F,
    112.0F,
    10.0F,
    93.0F,
    141.0F,
    10.0F,
    93.75F,
    141.0F,
    0.0F,
    93.75F,
    116.0F,
    0.0F,
    93.0F,
    116.0F,
    6.0F,
    93.0F,
    138.0F,
    6.0F,
    94.5F,
    138.0F,
    0.0F,
    94.5F,
    112.0F,
    0.0F,
    90.0F,
    112.0F,
    6.0F,
    90.0F,
    128.0F,
    6.0F,
    90.0F,
    128.0F,
    0.0F,
    90.0F },
    { 132.0F,
    0.0F,
    90.0F,
    132.0F,
    -10.0F,
    90.0F,
    108.0F,
    -10.0F,
    90.0F,
    108.0F,
    0.0F,
    90.0F,
    141.0F,
    0.0F,
    93.75F,
    141.0F,
    -10.0F,
    93.75F,
    112.0F,
    -10.0F,
    93.0F,
    112.0F,
    0.0F,
    93.0F,
    138.0F,
    0.0F,
    94.5F,
    138.0F,
    -6.0F,
    94.5F,
    116.0F,
    -6.0F,
    93.0F,
    116.0F,
    0.0F,
    93.0F,
    128.0F,
    0.0F,
    90.0F,
    128.0F,
    -6.0F,
    90.0F,
    112.0F,
    -6.0F,
    90.0F,
    112.0F,
    0.0F,
    90.0F },
    { 50.0F,
    0.0F,
    90.0F,
    50.0F,
    28.0F,
    90.0F,
    28.0F,
    50.0F,
    90.0F,
    0.0F,
    50.0F,
    90.0F,
    52.0F,
    0.0F,
    90.0F,
    52.0F,
    29.12F,
    90.0F,
    29.12F,
    52.0F,
    90.0F,
    0.0F,
    52.0F,
    90.0F,
    54.0F,
    0.0F,
    90.0F,
    54.0F,
    30.24F,
    90.0F,
    30.24F,
    54.0F,
    90.0F,
    0.0F,
    54.0F,
    90.0F,
    56.0F,
    0.0F,
    90.0F,
    56.0F,
    31.36F,
    90.0F,
    31.36F,
    56.0F,
    90.0F,
    0.0F,
    56.0F,
    90.0F },
    { 0.0F,
    50.0F,
    90.0F,
    -28.0F,
    50.0F,
    90.0F,
    -50.0F,
    28.0F,
    90.0F,
    -50.0F,
    0.0F,
    90.0F,
    0.0F,
    52.0F,
    90.0F,
    -29.12F,
    52.0F,
    90.0F,
    -52.0F,
    29.12F,
    90.0F,
    -52.0F,
    0.0F,
    90.0F,
    0.0F,
    54.0F,
    90.0F,
    -30.24F,
    54.0F,
    90.0F,
    -54.0F,
    30.24F,
    90.0F,
    -54.0F,
    0.0F,
    90.0F,
    0.0F,
    56.0F,
    90.0F,
    -31.36F,
    56.0F,
    90.0F,
    -56.0F,
    31.36F,
    90.0F,
    -56.0F,
    0.0F,
    90.0F },
    { -50.0F,
    0.0F,
    90.0F,
    -50.0F,
    -28.0F,
    90.0F,
    -28.0F,
    -50.0F,
    90.0F,
    0.0F,
    -50.0F,
    90.0F,
    -52.0F,
    0.0F,
    90.0F,
    -52.0F,
    -29.12F,
    90.0F,
    -29.12F,
    -52.0F,
    90.0F,
    0.0F,
    -52.0F,
    90.0F,
    -54.0F,
    0.0F,
    90.0F,
    -54.0F,
    -30.24F,
    90.0F,
    -30.24F,
    -54.0F,
    90.0F,
    0.0F,
    -54.0F,
    90.0F,
    -56.0F,
    0.0F,
    90.0F,
    -56.0F,
    -31.36F,
    90.0F,
    -31.36F,
    -56.0F,
    90.0F,
    0.0F,
    -56.0F,
    90.0F },
    { 0.0F,
    -50.0F,
    90.0F,
    28.0F,
    -50.0F,
    90.0F,
    50.0F,
    -28.0F,
    90.0F,
    50.0F,
    0.0F,
    90.0F,
    0.0F,
    -52.0F,
    90.0F,
    29.12F,
    -52.0F,
    90.0F,
    52.0F,
    -29.12F,
    90.0F,
    52.0F,
    0.0F,
    90.0F,
    0.0F,
    -54.0F,
    90.0F,
    30.24F,
    -54.0F,
    90.0F,
    54.0F,
    -30.24F,
    90.0F,
    54.0F,
    0.0F,
    90.0F,
    0.0F,
    -56.0F,
    90.0F,
    31.36F,
    -56.0F,
    90.0F,
    56.0F,
    -31.36F,
    90.0F,
    56.0F,
    0.0F,
    90.0F },
    { 8.0F,
    0.0F,
    102.0F,
    8.0F,
    4.48F,
    102.0F,
    4.48F,
    8.0F,
    102.0F,
    0.0F,
    8.0F,
    102.0F,
    16.0F,
    0.0F,
    96.0F,
    16.0F,
    8.96F,
    96.0F,
    8.96F,
    16.0F,
    96.0F,
    0.0F,
    16.0F,
    96.0F,
    52.0F,
    0.0F,
    96.0F,
    52.0F,
    29.12F,
    96.0F,
    29.12F,
    52.0F,
    96.0F,
    0.0F,
    52.0F,
    96.0F,
    52.0F,
    0.0F,
    90.0F,
    52.0F,
    29.12F,
    90.0F,
    29.12F,
    52.0F,
    90.0F,
    0.0F,
    52.0F,
    90.0F },
    { 0.0F,
    8.0F,
    102.0F,
    -4.48F,
    8.0F,
    102.0F,
    -8.0F,
    4.48F,
    102.0F,
    -8.0F,
    0.0F,
    102.0F,
    0.0F,
    16.0F,
    96.0F,
    -8.96F,
    16.0F,
    96.0F,
    -16.0F,
    8.96F,
    96.0F,
    -16.0F,
    0.0F,
    96.0F,
    0.0F,
    52.0F,
    96.0F,
    -29.12F,
    52.0F,
    96.0F,
    -52.0F,
    29.12F,
    96.0F,
    -52.0F,
    0.0F,
    96.0F,
    0.0F,
    52.0F,
    90.0F,
    -29.12F,
    52.0F,
    90.0F,
    -52.0F,
    29.12F,
    90.0F,
    -52.0F,
    0.0F,
    90.0F },
    { -8.0F,
    0.0F,
    102.0F,
    -8.0F,
    -4.48F,
    102.0F,
    -4.48F,
    -8.0F,
    102.0F,
    0.0F,
    -8.0F,
    102.0F,
    -16.0F,
    0.0F,
    96.0F,
    -16.0F,
    -8.96F,
    96.0F,
    -8.96F,
    -16.0F,
    96.0F,
    0.0F,
    -16.0F,
    96.0F,
    -52.0F,
    0.0F,
    96.0F,
    -52.0F,
    -29.12F,
    96.0F,
    -29.12F,
    -52.0F,
    96.0F,
    0.0F,
    -52.0F,
    96.0F,
    -52.0F,
    0.0F,
    90.0F,
    -52.0F,
    -29.12F,
    90.0F,
    -29.12F,
    -52.0F,
    90.0F,
    0.0F,
    -52.0F,
    90.0F },
    { 0.0F,
    -8.0F,
    102.0F,
    4.48F,
    -8.0F,
    102.0F,
    8.0F,
    -4.48F,
    102.0F,
    8.0F,
    0.0F,
    102.0F,
    0.0F,
    -16.0F,
    96.0F,
    8.96F,
    -16.0F,
    96.0F,
    16.0F,
    -8.96F,
    96.0F,
    16.0F,
    0.0F,
    96.0F,
    0.0F,
    -52.0F,
    96.0F,
    29.12F,
    -52.0F,
    96.0F,
    52.0F,
    -29.12F,
    96.0F,
    52.0F,
    0.0F,
    96.0F,
    0.0F,
    -52.0F,
    90.0F,
    29.12F,
    -52.0F,
    90.0F,
    52.0F,
    -29.12F,
    90.0F,
    52.0F,
    0.0F,
    90.0F },
    { 0.0F,
    0.0F,
    120.0F,
    0.0F,
    0.0F,
    120.0F,
    0.0F,
    0.0F,
    120.0F,
    0.0F,
    0.0F,
    120.0F,
    32.0F,
    0.0F,
    120.0F,
    32.0F,
    18.0F,
    120.0F,
    18.0F,
    32.0F,
    120.0F,
    0.0F,
    32.0F,
    120.0F,
    0.0F,
    0.0F,
    108.0F,
    0.0F,
    0.0F,
    108.0F,
    0.0F,
    0.0F,
    108.0F,
    0.0F,
    0.0F,
    108.0F,
    8.0F,
    0.0F,
    102.0F,
    8.0F,
    4.48F,
    102.0F,
    4.48F,
    8.0F,
    102.0F,
    0.0F,
    8.0F,
    102.0F },
    { 0.0F,
    0.0F,
    120.0F,
    0.0F,
    0.0F,
    120.0F,
    0.0F,
    0.0F,
    120.0F,
    0.0F,
    0.0F,
    120.0F,
    0.0F,
    32.0F,
    120.0F,
    -18.0F,
    32.0F,
    120.0F,
    -32.0F,
    18.0F,
    120.0F,
    -32.0F,
    0.0F,
    120.0F,
    0.0F,
    0.0F,
    108.0F,
    0.0F,
    0.0F,
    108.0F,
    0.0F,
    0.0F,
    108.0F,
    0.0F,
    0.0F,
    108.0F,
    0.0F,
    8.0F,
    102.0F,
    -4.48F,
    8.0F,
    102.0F,
    -8.0F,
    4.48F,
    102.0F,
    -8.0F,
    0.0F,
    102.0F },
    { 0.0F,
    0.0F,
    120.0F,
    0.0F,
    0.0F,
    120.0F,
    0.0F,
    0.0F,
    120.0F,
    0.0F,
    0.0F,
    120.0F,
    -32.0F,
    0.0F,
    120.0F,
    -32.0F,
    -18.0F,
    120.0F,
    -18.0F,
    -32.0F,
    120.0F,
    0.0F,
    -32.0F,
    120.0F,
    0.0F,
    0.0F,
    108.0F,
    0.0F,
    0.0F,
    108.0F,
    0.0F,
    0.0F,
    108.0F,
    0.0F,
    0.0F,
    108.0F,
    -8.0F,
    0.0F,
    102.0F,
    -8.0F,
    -4.48F,
    102.0F,
    -4.48F,
    -8.0F,
    102.0F,
    0.0F,
    -8.0F,
    102.0F },
    { 0.0F,
    0.0F,
    120.0F,
    0.0F,
    0.0F,
    120.0F,
    0.0F,
    0.0F,
    120.0F,
    0.0F,
    0.0F,
    120.0F,
    0.0F,
    -32.0F,
    120.0F,
    18.0F,
    -32.0F,
    120.0F,
    32.0F,
    -18.0F,
    120.0F,
    32.0F,
    0.0F,
    120.0F,
    0.0F,
    0.0F,
    108.0F,
    0.0F,
    0.0F,
    108.0F,
    0.0F,
    0.0F,
    108.0F,
    0.0F,
    0.0F,
    108.0F,
    0.0F,
    -8.0F,
    102.0F,
    4.48F,
    -8.0F,
    102.0F,
    8.0F,
    -4.48F,
    102.0F,
    8.0F,
    0.0F,
    102.0F } };
    public Teapot() { super(PATCHES); }
    public static final String jlc$CompilerVersion$jl7 = "2.6.1";
    public static final long jlc$SourceLastModified$jl7 = 1163983660000L;
    public static final String jlc$ClassType$jl7 = ("H4sIAAAAAAAAAL0YXWwcxXlu/e84seOQENLYSWwH4YTeNlWplBoBzuEQhws5" +
                                                    "xU7UHgIz3pu723hvdzM7Z1+cGkhUlIiHCLWGhgr8gEIpNCSoakSrCikvLSCq" +
                                                    "SqCqVR9K2r5Am0ZqHkpRaUu/b2b3dm/v7KgvtbRzszPf///6wnXS4nGy03Ws" +
                                                    "4wXLEUlWEcmj1l1JcdxlXnJ/+q4M5R7LpSzqeZNwNmUMvNH9yWfPFHs00pol" +
                                                    "66htO4IK07G9Q8xzrFmWS5Pu8HTMYiVPkJ70UTpL9bIwLT1temIkTVZFUAUZ" +
                                                    "Sgci6CCCDiLoUgR9NIQCpNXMLpdSiEFt4R0jj5NEmrS6BoonyLZaIi7ltOST" +
                                                    "yUgNgEI7vh8BpSRyhZOtVd2VznUKP7tTX/zuoz0/aiLdWdJt2hMojgFCCGCS" +
                                                    "JV0lVppm3BvN5VguS9bajOUmGDepZc5LubOk1zMLNhVlzqpGwsOyy7jkGVqu" +
                                                    "y0DdeNkQDq+qlzeZlQveWvIWLYCuG0JdlYZ78RwU7DRBMJ6nBgtQmmdMOyfI" +
                                                    "ljhGVcehBwEAUNtKTBSdKqtmm8IB6VW+s6hd0CcEN+0CgLY4ZeAiyKZliaKt" +
                                                    "XWrM0AKbEmRjHC6jrgCqQxoCUQRZHweTlMBLm2Jeivjn+kN3nz1h77M1KXOO" +
                                                    "GRbK3w5I/TGkQyzPOLMNphC7dqSfoxveOqMRAsDrY8AK5s1v3rjvzv4r7yiY" +
                                                    "LzSAOTh9lBliyjg/veb9zanh3U0oRrvreCY6v0ZzGf4Z/2ak4kLmbahSxMtk" +
                                                    "cHnl0C++8eRr7JpGOsdJq+FY5RLE0VrDKbmmxfgDzGacCpYbJx3MzqXk/Thp" +
                                                    "g33atJk6PZjPe0yMk2ZLHrU68h1MlAcSaKI22Jt23gn2LhVFua+4hJA2eEgX" +
                                                    "PE1E/clfQQz9sAfhrlOD2qbt6BC8jHKjqDPDmZoG6xZLlM94ulH2hFPSvbKd" +
                                                    "t5w53eOG7vBC9d1wONMF8zxmUUGnLaZPMuqCHTDY3P8Pmwpq2zOXSIAjNsfL" +
                                                    "gAUZtM+xcoxPGYvlPWM3Lk69p1XTwrcTFC7glvS5JZFbMsotqbiRREIyuQW5" +
                                                    "Kk+Dn2Yg46EWdg1PPLL/sTMDYN+KO9cMRkbQAdDTF2XMcFJhWRiXxc+A2Nz4" +
                                                    "0sOnk5++cq+KTX35Gt4Qm1w5N3fyyBNf0ohWW4xRNTjqRPQMltBqqRyKJ2Ej" +
                                                    "ut2nP/7k0nMLTpiONdXdrxL1mJjlA3EncMdgOaibIfkdW+nlqbcWhjTSDKUD" +
                                                    "yqWgEN5QifrjPGqyfSSonKhLCyicd3iJWngVlLtOUeTOXHgio2ON3K8Fp6zC" +
                                                    "8MfNn/18kL94u87F9RYVTejlmBayMu/96ZXnL39v524tWsS7I21xgglVEtaG" +
                                                    "QTLJGYPz35/LfOfZ66cflhECEIONGAzhmoICAS4Dsz71zrHfXf3w/K+1MKoE" +
                                                    "dMrytGUaFaBxe8gFyocFJQx9P3TYLjk5M29i8GJw/qt7+67Lfz3bo7xpwUkQ" +
                                                    "DHfenEB4ftse8uR7j/6jX5JJGNi+Qs1DMGWAdSHlUc7pcZSjcvKDvuffpi9C" +
                                                    "dYWK5pnzTBYpIjUj0vS6dNUOuSZjd7tw2erW3VXkycZq1g0vn0R7sQtHku+f" +
                                                    "B63pU3/6VGpUlz4Nmk8MP6tfeGFT6p5rEj+MY8TeUqkvRzCxhLhffq30d22g" +
                                                    "9ecaacuSHsMfh45Qq4zRkoURwAtmJBiZau5r27nqXSPVPN0cz6EI23gGhWUQ" +
                                                    "9giN+85Y0tyGVr4Pno/8pGmJJ02CyM1uiTIg1+243CF90iRIm8vNWeh1EL2e" +
                                                    "nLwEyGHa1KrAXWZ0MrVvbAI8t315z8kgUu186fuDv3piafCPYPUsaTc90G+U" +
                                                    "FxrMFxGcv124eu2D1X0XZcVpnqae0jQ+mNXPXTXjlDRMl6sCbtStrBxsGW6W" +
                                                    "YBCY9ScVfaH36swLH7+uKn08smLA7Mzi058nzy5qkdlvsG78iuKo+U9KuFq5" +
                                                    "7nP4S8DzH3zQZXig+n9vyh9CtlanEFeqs20lsSSLvR9dWvjZDxZOKzV6a0ef" +
                                                    "MZjsX//Nv3+ZPPeHdxv0WYg9h4pqAif8lMX3r7hBFGUaR5GG22Fc7oWgabWY" +
                                                    "XRBFCTSGy7hyyoOCNIEPcXu/7yfkpCkS8n298IsTZg/MoI7NsM4Fd6q9m06y" +
                                                    "Ov/DZaVOZk76apr7ARkmYXo//eoP3xTv7/yaMtOO5aMkjvj2qb9smryn+Nj/" +
                                                    "0NK3xJwWJ/nqgQvvPnC78W2NNFWrRN2HRC3SSG1t6OQMvnzsyZoK0e/Kn/tx" +
                                                    "GVqhbhsr3ElyFCLDQD8ot4FttzTuS2MlV8hOMv+TW3989ytLH8rGWCE3iaij" +
                                                    "N48oXCdwmcQlVR86+Pp1XLL1sYDvjyhjpG5mjGMr3MlDOcnnlRS4Fiuy1PYo" +
                                                    "+kORXkcwYfuW+6aSyXr+1OJS7uDLuzSfQ1qQDuG4X7TYLLNqSEFKqTEXzb+x" +
                                                    "7nNafQIaF5e6229dOvxbVUaDz7QO+FbKly0r2kwi+1aXs7wp+Xeo1qJ0OSFI" +
                                                    "34qDtyBd0Vcp77zCfVyQnjiuIM34EwU7KciqCBg0G38XBfoW1AwAwu1TblAG" +
                                                    "7lj5k2APmzcZP8C8oh99gR3duIMGa1Jf/jsjSNOy+ofGlHFpaf9DJ2589WWZ" +
                                                    "85AKdH5efv5C+1EjbjXVty1LLaDVum/4szVvdGwPXL4Gl15/ro3KJoPrv2wB" +
                                                    "MFg8EgAA");
}

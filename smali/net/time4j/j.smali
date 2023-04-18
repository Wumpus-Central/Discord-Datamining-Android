.class public final Lnet/time4j/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field private static final serialVersionUID:J = -0x393ece74c442012cL


# instance fields
.field private final days:J

.field private final time:Lnet/time4j/g0;


# direct methods
.method constructor <init>(JLnet/time4j/g0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lnet/time4j/j;->days:J

    .line 5
    .line 6
    iput-object p3, p0, Lnet/time4j/j;->time:Lnet/time4j/g0;

    .line 7
    .line 8
    return-void
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
.end method


# virtual methods
.method public a()J
    .locals 2

    iget-wide v0, p0, Lnet/time4j/j;->days:J

    return-wide v0
.end method

.method public b()Lnet/time4j/g0;
    .locals 1

    iget-object v0, p0, Lnet/time4j/j;->time:Lnet/time4j/g0;

    return-object v0
.end method

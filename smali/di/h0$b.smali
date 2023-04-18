.class final Ldi/h0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldi/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:Ldi/o0;

.field private final b:Ldi/g1;


# direct methods
.method public constructor <init>(Ldi/o0;Ldi/g1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ldi/h0$b;->a:Ldi/o0;

    iput-object p2, p0, Ldi/h0$b;->b:Ldi/g1;

    return-void
.end method


# virtual methods
.method public final a()Ldi/o0;
    .locals 1

    iget-object v0, p0, Ldi/h0$b;->a:Ldi/o0;

    return-object v0
.end method

.method public final b()Ldi/g1;
    .locals 1

    iget-object v0, p0, Ldi/h0$b;->b:Ldi/g1;

    return-object v0
.end method

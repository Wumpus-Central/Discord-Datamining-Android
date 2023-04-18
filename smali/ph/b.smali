.class Lph/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lei/e$a;


# instance fields
.field private final a:Z

.field private final b:Lmg/a;

.field private final c:Lmg/a;


# direct methods
.method public constructor <init>(ZLmg/a;Lmg/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lph/b;->a:Z

    iput-object p2, p0, Lph/b;->b:Lmg/a;

    iput-object p3, p0, Lph/b;->c:Lmg/a;

    return-void
.end method


# virtual methods
.method public a(Ldi/g1;Ldi/g1;)Z
    .locals 3

    iget-boolean v0, p0, Lph/b;->a:Z

    iget-object v1, p0, Lph/b;->b:Lmg/a;

    iget-object v2, p0, Lph/b;->c:Lmg/a;

    invoke-static {v0, v1, v2, p1, p2}, Lph/c;->a(ZLmg/a;Lmg/a;Ldi/g1;Ldi/g1;)Z

    move-result p1

    return p1
.end method
